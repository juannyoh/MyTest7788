package test;

import java.util.ArrayList;
import java.util.List;

public class Mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="0501";
		String ss2="0501";
		System.out.println(ss.equals(ss2));
		
		//		System.out.println(ss.substring(ss.length()-2, ss.length()));
//		System.out.println(ValueType.STRING.toString());
		
		String xx[]={"2","4","6"};
		
		for(int s=xx.length,i=s-1;i>=0;i--){
			System.out.println(xx[i]);
		}
		
//		List<String> list=new ArrayList<String>();
//		int i=0;
//		for(String s:xx){
//			i++;
////			System.out.println(i);
//			list.add(s);
//		}
//		
////		String [] aa=new String[list.size()];
////		list.toArray(aa);
////		System.out.println(aa);
//		
//		int count=3;
//		int cs=3;
////	    count+=cs;
//		int d=cs/count;
//		d+=1;
//	    System.out.println(d);
		
	}

}

enum ValueType {

	NUMBER,		// 鏁板瓧
	STRING,		// 瀛楃涓�
	BOOLEAN,	// 甯冨皵
	DATE;	  	// 鏃ユ湡
}


