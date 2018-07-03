package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.google.common.collect.Lists;

public class AAA2 {

	public static void main(String[] args) {
	    
//	    List<String> aa=Arrays.asList("1234567890","3","1");
//	    
//	    List<String> bb=Arrays.asList("a","2");
//	    
//	    System.out.println(aa.containsAll(bb));
//	    
//	    List<String> dataList=Arrays.asList("123456789012345678901234567890"
//	            + "123456789012345678901234567890123456789012345"
//	            + "678901234567890123456789012345678901234567890","3","1");
//	    
//	    dataList.stream().forEach(str->{
//            if(StringUtils.isNotEmpty(str)&&str.length()>100){
//                str= StringUtils.substring(str, 0, 1);
//            }
//        });
//	    System.out.println(dataList);
	    
//	    String aa="22";
//	    String bb=aa;
//	    aa=null;
//	    System.out.println(aa+","+bb);
	    
	    
	    String ssss[]={"11","22","33"};
	    List<String> ll=Arrays.asList(ssss);
	    System.out.println(ll.subList(0, 2));

//		String aa = "3.2mm.jpg";
//
//		System.out.println(10 / 3);
//
//		String s=StringEscapeUtils
//				.unescapeHtml4("\u003cp\u003e\u003ca href\u003d\"www.baidu.com\"\u003e百度啦\u003c/a\u003e哦哦\u003c/p\u003e");
//		System.out
//				.println(s);

		// double a1=0;
		// int b1=(int)a1;
		// System.out.println(b1);

		// Double d=0.012d;
		// BigDecimal decimal=new BigDecimal(d);
		// System.out.println("ROUND_CEILING"+decimal.setScale(2,
		// BigDecimal.ROUND_CEILING));
		// System.out.println("ROUND_UP"+decimal.setScale(2,
		// BigDecimal.ROUND_UP));

		// String codes[]={"1","2","3"};
		// for(int i=0;i<codes.length;i++){
		// String tempCodes[]=ArrayUtils.subarray(codes, 0, i+1);
		// System.out.println(tempCodes);
		// }

		// getCurrMonthLast();
		// sameDate(new Date(),new Date());

		/*
		 * String settingValue=""; int i=1;
		 * 
		 * List<Integer> list=Arrays.asList(1,2);
		 * System.out.println(list.contains(i));
		 */

		// Integer s1=100,s2=100,s3=130,s4=130;
		// System.out.println(s1 == s2);
		// System.out.println(s3==s4);
		//
		// String aa="aaa";
		// System.out.println(StringUtils.indexOf(aa, "_"));
		//
		// Integer a=22;
		// addd(a);
		// System.out.println(a);

		// settingValue=StringUtils.replaceAll(StringUtils.removeEnd(StringUtils.removeStart(settingValue,
		// "\""), "\""), "\\\\", "").replace("\"{", "{").replace("}\"",
		// "}");//去掉前后双引号
		//
		// List<LayerInfo> layerList=JSONArray.parseArray(settingValue,
		// LayerInfo.class);
		// PropertyFilter profilter = new PropertyFilter(){
		// public boolean apply(Object object, String name, Object value) {
		// if(name.equalsIgnoreCase("id")
		// ||name.equalsIgnoreCase("code")
		// ||name.equalsIgnoreCase("depth")
		// ||name.equalsIgnoreCase("dataCount")
		// ||name.equalsIgnoreCase("childLayers")
		// ||name.equalsIgnoreCase("eyeStatus")){
		// //false表示last字段将被排除在外
		// return true;
		// }
		// return false;
		// }
		// };
		// settingValue=JSON.toJSONString(layerList,profilter);
		// System.out.println(settingValue);

		// TODO Auto-generated method stub
		// test();
		//
		// System.out.println(numberDecimalFormat.format(10));

		// String ss="aa-bb_cc_dd";
		//
		// System.out.println(ss.substring(ss.indexOf("-")+1, ss.indexOf("_")));

		// System.out.println(Double.MAX_VALUE>=111111111111111111111d);
		// System.out.println(numberDecimalFormat.format(Double.parseDouble("1.999999999999999")));
		// System.out.println(Double.parseDouble("1.999999999999999"));
		//
		// BigDecimal bg=new BigDecimal("9999999999999999");
		// System.out.println(bg.doubleValue());
		//
		// BigDecimal bd1 = new BigDecimal("1.1111111111111111E20");
		// System.out.println(bd1.toPlainString());
		// System.out.println(bd1.setScale(2,
		// BigDecimal.ROUND_HALF_UP).toPlainString());

	}

	private static void test() {
		List<String> list = Lists.newArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		for (String s : list) {
			if (s.equals("2")) {
				list.remove(s);
			}
		}

		System.out.println(list);

	}

	private static void addd(int a) {
		a = a + 1;
	}
	
	private static boolean sameDate(Date d1, Date d2) {
        LocalDate localDate1 = ZonedDateTime.ofInstant(d1.toInstant(),
                ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = ZonedDateTime.ofInstant(d2.toInstant(),
                ZoneId.systemDefault()).toLocalDate();
        return localDate1.isEqual(localDate2);
    }

    /**
     * 获取当月的最后一天
     * 
     * @return
     */
    public static Date getCurrMonthLast() {
        Calendar currCal = Calendar.getInstance();
        currCal.add(Calendar.MONTH, 1);
        currCal.set(Calendar.DAY_OF_MONTH, 1);
        currCal.add(Calendar.DATE, -1);
        System.out.println(currCal.getTime());
        return currCal.getTime();
    }

    public static List<Date> getCurrMonthLasts() {
        List<Date> dateList = Lists.newArrayList();
        Calendar currCal = Calendar.getInstance();
        for (int i = 1; i <= 12; i++) {
            currCal.set(Calendar.MONTH, i);
            currCal.set(Calendar.DAY_OF_MONTH,
                    currCal.getActualMaximum(Calendar.DAY_OF_MONTH));
            Date tt = currCal.getTime();
            long time = tt.getTime() / 1000;
            Date s = new Date(time * 1000);
            System.out.println(tt.getTime() / 1000);
            dateList.add(tt);
        }
        return dateList;
    }

    private static DecimalFormat numberDecimalFormat = new DecimalFormat(
            "###.##");
}
