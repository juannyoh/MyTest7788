package test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import com.google.common.collect.Lists;

public class AAA {
	public static void main(String[] args) {
		Boolean xx = null;
		System.out.println(BooleanUtils.isNotTrue(xx));

		
		Date btime=DateUtils.addMonths(new Date(), 2);
		System.out.println(DateFormatUtils.format(btime, "yyyy-MM-dd HH:mm:ss"));
		
		
		DecimalFormat df=new DecimalFormat(".##");
		System.out.println(Double.parseDouble(df.format(1.010)));
		
		System.out.println(Boolean.parseBoolean(null));
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<10;i++){
			list.add(i+"1");
		}
		
		int a=list.size();
		
		System.out.println("xxx:"+a++);
		System.out.println("xxx:"+a++);
		System.out.println(list.size());
		System.out.println(list.subList(0, 2));
		System.out.println(list.size());
		
		
		
		DecimalFormat decimalFormat=new DecimalFormat("#.####");
		
		System.out.println(decimalFormat.format(100.00));
		
		
		int ii=1;
		System.out.println(ii);
		System.out.println(++ii);
		System.out.println(ii);
		System.out.println(++ii);System.out.println(ii);
		
		Float oo=1.0f;
		System.out.println(oo.intValue());
		
		List<Integer> aaaa=Lists.newArrayList();
		aaaa.add(1);
		aaaa.add(2);
		aaaa.add(3);
		aaaa.add(4);
		System.out.println(aaaa.subList(2, 4));
		
		int rowCount=1;
		int currentRow=rowCount;
		rowCount++;
		rowCount++;
		System.out.println(currentRow);
		System.out.println(rowCount);
		
		Integer aa=11;
		double bb=23;
		System.out.println(aa/bb);
		
		System.out.println((int)Math.ceil((double)(1/10)));
		
		
		System.out.println(RandomStringUtils.randomAlphanumeric(6));
		
		Integer x=0;
		dealCount(x);
		System.out.println(x);
		
		System.out.println(5+1+"");
		
		
		System.out.println(Math.rint((0/10)*100)+"%");
		
		System.out.println(getPercent(1,0d));
		NumberFormat nf  =  NumberFormat.getPercentInstance();
		try {
			Number xa=nf.parse("100.00%");
			nf.setMinimumFractionDigits( 2 );
			
			System.out.println("**"+xa.doubleValue());
			String percent=nf.format(xa.doubleValue());
			System.out.println(percent);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		NumberFormat numberFormat=NumberFormat.getIntegerInstance();
		numberFormat.setRoundingMode(RoundingMode.HALF_UP);
		numberFormat.setMinimumFractionDigits(1);
		System.out.println(numberFormat.format(5623.25/1000));//保存公里数
	}
	
	
	private static void dealCount(Integer x){
		for(int i=0;i<5;i++){
			x++;
		}
	}
	
	
	private static String getPercent(int x,double total){
		String result="";//接受百分比的值
//		double x_double=x*1.0;
//		double tempresult=x_double/total;
		NumberFormat nf  =  NumberFormat.getPercentInstance();     //注释掉的也是一种方法
		nf.setMinimumFractionDigits( 2 );       // 保留到小数点后几位
//		DecimalFormat df1 = new DecimalFormat("0.00%");    //##.00%   百分比格式，后面不足2位的用0补齐
		result=nf.format(x/total);
//		result= df1.format(tempresult);
		return result;
	}
}
