package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import com.google.common.collect.Lists;

public class AAA2 {

	 private static DecimalFormat numberDecimalFormat = new DecimalFormat("###.##");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test();
//		
//		System.out.println(numberDecimalFormat.format(10));
		
		System.out.println(Double.MAX_VALUE>=111111111111111111111d);
		System.out.println(numberDecimalFormat.format(Double.parseDouble("1.999999999999999")));
		System.out.println(Double.parseDouble("1.999999999999999"));

		BigDecimal bg=new BigDecimal("9999999999999999");
		System.out.println(bg.doubleValue());
		
		BigDecimal bd1 = new BigDecimal("1.1111111111111111E20");
        System.out.println(bd1.toPlainString());
        System.out.println(bd1.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString());
	
	}
	
	
	private static void test(){
		List<String> list=Lists.newArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		for(String s:list){
			if(s.equals("2")){
				list.remove(s);
			}
		}
		
		System.out.println(list);
		
	}

}
