package com.util;

/**
 * Copyright (C) 2009 numenzq studio. All Rights Reserved.
 */
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFWriter;


/**
 * DBF 文件解析
 *
 */
public class DbfUtil {
    
    private final static  String CHARSET = "GB2312";
    /**
     * 读DBF文件
     * @param file
     * @param clazz
     * @param template
     * @return
     * @throws DocumentException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws IOException
     */
    public static <T> List<T> readDbf(File file, Class<T> clazz, InputStream template)
            throws DocumentException,
            InstantiationException, IllegalAccessException, InvocationTargetException,
            NoSuchMethodException, IOException {
        FileInputStream fis = new FileInputStream(file);
        DBFReader reader = new DBFReader(fis);
        reader.setCharactersetName(CHARSET);

        List<Element> propertys = readTemplate(template);
        for(Element element : propertys){
            int fieldsCount = reader.getFieldCount();
            for (int i = 0; i < fieldsCount; i++) {
                DBFField field = reader.getField(i);
                if(field.getName().equals(element.attributeValue("column"))){
                    element.addAttribute("index", i+"");   
                    break;
                }
            }
        }
        
        List<T> records = new ArrayList<T>();
        for (int i = 0; i < reader.getRecordCount(); i++) {
//            System.out.println(i+1 + "/" + reader.getRecordCount());
            records.add(readLine(clazz, propertys, reader.nextRecord()));
        }
        
        fis.close();
        return records;
    }

           /**
     * 写DBF文件
     * @param beans
     * @param template
     * @return
     * @throws DocumentException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws IOException
     */
    public static byte[] writeDbf(List<? extends Object> beans, InputStream template) throws DocumentException,
            IllegalAccessException, InvocationTargetException, NoSuchMethodException,
            IOException {
        List<Element> propertys = readTemplate(template);

        DBFWriter writer = new DBFWriter();
        writer.setCharactersetName(CHARSET);
        writer.setFields(writeFields(propertys));

        for (int i = 0; i < beans.size(); i++) {
            writer.addRecord(writeLine(beans.get(i), propertys));
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writer.write(baos);

        return baos.toByteArray();
    }

    /**
     * 写DBF文件（方式2）
     * @param beans
     * @param template
     * @param file
     * @throws DocumentException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws IOException
     */
    public static void writeDbf(List<? extends Object> beans, InputStream template,File file) throws DocumentException,
    IllegalAccessException, InvocationTargetException, NoSuchMethodException,
    IOException {
        List<Element> propertys = readTemplate(template);
        DBFWriter writer = new DBFWriter(file);
        writer.setCharactersetName(CHARSET);
        writer.setFields(writeFields(propertys));
        
        for (int i = 0; i < beans.size(); i++) {
            writer.addRecord(writeLine(beans.get(i), propertys));
        }
        writer.write();
    }

        /**
     * SAX解析表结构模板
     * @param in
     * @return
     * @throws DocumentException
     */
    @SuppressWarnings("unchecked")
    private static List<Element> readTemplate(InputStream in) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(in);
        return (List<Element>)document.getRootElement().elements();
    }

        /**
     * 读取一行数据
     * @param clazz
     * @param propertys
     * @param values
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    private static <T> T readLine(Class<T> clazz, List<Element> propertys, Object[] values)
            throws InstantiationException, IllegalAccessException, InvocationTargetException,
            NoSuchMethodException {
        T bean = clazz.newInstance();
        for (int i = 0; i < propertys.size(); i++) {
            Element property = propertys.get(i);
            if(property.attributeValue("index") != null && property.attributeValue("index").length() > 0){
                int index = Integer.parseInt(property.attributeValue("index"));
                Object value = values[index];
                if (property.attributeValue("type").equals("C")) {
                    value = ((String) value).trim();
                }else if (property.attributeValue("type").equals("N")) {
//                    if (property.attributeValue("scale")!=null && !"".equals(property.attributeValue("scale"))) {
                        value = new BigDecimal(((Double) value).doubleValue());
//                    }else{
//                        value = ((Double) value).longValue();
//                    }
                    
                }
//                BeanUtil.copyProperty(bean, property.attributeValue("name"), value);
                PropertyUtils.setProperty(bean, property.attributeValue("name"), value);
            }
        }
        return bean;
    }

        /**
     * 写一行数据
     * @param bean
     * @param propertys
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    private static Object[] writeLine(Object bean, List<Element> propertys)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Object[] row = new Object[propertys.size()];
        for (int i = 0; i < propertys.size(); i++) {
            Element element =  propertys.get(i);
            row[i] = PropertyUtils.getProperty(bean, element.attributeValue("name"));
        }

        return row;
    }

        /**
     * 设置表结构
     * @param propertys
     * @return
     */
    private static DBFField[] writeFields(List<Element> propertys) {
        DBFField[] fields = new DBFField[propertys.size()];
        for (int i = 0; i < propertys.size(); i++) {
            Element property = propertys.get(i);
            fields[i] = new DBFField();
            fields[i].setName(property.attributeValue("column"));
            fields[i].setDataType((byte) property.attributeValue("type").charAt(0));
            if (property.attributeValue("length") != null) {
                fields[i].setFieldLength(Integer.parseInt(property.attributeValue("length")));
            }
            if (property.attributeValue("scale") != null) {
                fields[i].setDecimalCount(Integer.parseInt(property.attributeValue("scale")));
            }
        }
        return fields;
    }
    
}
