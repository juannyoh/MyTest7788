package com.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 * EXCEL解析类
 */
public class ExcelUtil {

	private static final String EXCEL_2003 = "xls";
	private static final String EXCEL_2007 = "xlsx";

	private ExcelUtil() {
	}

	/**
	 * Excel解析
	 * @param is  Excel文件流
	 * @param fileName  文件名
	 * @return
	 * @throws IOException
	 */
	public static Map<String, Object> readExcel(InputStream is,
			String fileName,int dataType) throws IOException {
		Map<String, Object> excelMap=new HashMap<String,Object>();
		//默认true
		excelMap.put("success", true);
		
		if (is == null || fileName == null) {
			excelMap.put("success", false);
			excelMap.put("info", "ss");
			return excelMap;
		}
		Workbook workbook = null;
		if (fileName.endsWith(EXCEL_2003)) {
			workbook = new HSSFWorkbook(is);
		} else if (fileName.endsWith(EXCEL_2007)) {
			workbook = new XSSFWorkbook(is);
		} else {
			excelMap.put("success", false);
			excelMap.put("info","ss");
			return excelMap;
		}
		List<List<String>> dataList = new ArrayList<List<String>>();//数据表格（每列数据）
		List<String> titleList = new ArrayList<String>();// 标题
		// 暂时只考虑第一个sheet
		Sheet sheet = workbook.getSheetAt(0);
		// 从标题列的下一列开始
		try {
			//获取表头
			titleList=readPointExcelHeader(sheet.getRow(sheet.getFirstRowNum()));
			//解析数据
			for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				List<String> valueList=new ArrayList<String>();
				if (row != null) {
					Cell cell=null;
					for(int j=0;j < titleList.size();j++){
						cell = row.getCell(j);
						if (cell != null) {
							if (j == 0) {//第一列强制设置为文本类型
								cell.setCellType(Cell.CELL_TYPE_STRING);
							}
							valueList.add(getCellValueAsString(cell));
						} else {
							valueList.add("");
						}
					}
					dataList.add(valueList);
				}
			}
		} catch (Exception e) {
			excelMap.put("success", false);
			excelMap.put("info", "ss");
			return excelMap;
		}
		excelMap.put("titles", titleList);
		excelMap.put("datas", dataList);
		return excelMap;
	}
	
	/**
	 * 判断是否列超过长度
	 * @param dataType 数据类型（2网点）
	 * @param titles 表头
	 * @return true false
	 * @see
	 */
//	@SuppressWarnings("unused")
//	private static boolean isTitleOutOfRange(int dataType,List<String> titles){
//		boolean flag=false;
//		//网点限制只能最多上传50个字段
//		if(ListUtil.isNotEmpty(titles)){
//			if(dataType==2&&titles.size()>50){
//				flag=true;
//			}
//		}
//		return flag; 
//	}
	
	
	/**
	 * 根据导入的excel获取表头
	 * @param row
	 * @return
	 * @throws Exception
	 */
	private static List<String> readPointExcelHeader(Row row)throws Exception{
		List<String> result=new ArrayList<String>();
		//从第一行开始读标题
		try {
			if (row != null) {
				int i=1;
				for(int j=0;j<row.getLastCellNum();j++){
					Cell cell=row.getCell(j);
					String value=getCellValueAsString(cell);
					if(value!=null&&!value.equals("")){
						result.add(value);
					}else{
						result.add("自定义列-"+i);
						i++;
					}
				}
			}
		} catch (Exception e) {
			throw e;
		}
		return result;
	}
	
	/**
	 * 获取cell值
	 * @param cell
	 * @return
	 * @see
	 */
	private static String getCellValueAsString(Cell cell) {
		if(null != cell){
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_BLANK:
				return "";
			case Cell.CELL_TYPE_BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case Cell.CELL_TYPE_FORMULA:
				return cell.getCellFormula();
			case Cell.CELL_TYPE_NUMERIC://数字还是以文本去读取
				cell.setCellType(Cell.CELL_TYPE_STRING);
				return cell.getStringCellValue();
//				return String.valueOf(cell.getNumericCellValue());
			case Cell.CELL_TYPE_STRING:
				return cell.getStringCellValue();
			default:
				return null;
			}
		}else{
			return null;
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			int nameSize=40;
			InputStream is = new FileInputStream("E:\\temp\\区划数据222.xls");
			Map<String, Object> map=readExcel(is, "区划数据222.xls", 1);
			List<List<String>> namesList=(List<List<String>>) map.get("datas");
			List<String> resultList=new ArrayList<String>();
			for(int i=0;i<400;i++){
				StringBuilder sb=new StringBuilder();
				List<String>  nameLi=new ArrayList<String>();
				for(int j=0;j<nameSize;j++){
					int index=RandomUtils.nextInt(0, namesList.size());
					nameLi.add(namesList.get(index).get(0));
				}
				sb.append(StringUtils.join(nameLi, ","));
				resultList.add("["+sb.toString()+"]");
			}
			
			IOUtils.writeLines(resultList, "\r\n", new FileOutputStream("E:\\temp\\areaky1-"+nameSize+".csv"), "utf-8");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}