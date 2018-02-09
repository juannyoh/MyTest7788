package test;

import org.apache.commons.lang.RandomStringUtils;

public class Test5 {
public static void main(String[] args) {
	System.out.println(RandomStringUtils.randomAlphabetic(6));
	System.out.println(RandomStringUtils.randomAlphanumeric(2));
	System.out.println(RandomStringUtils.randomAscii(6));
	System.out.println(RandomStringUtils.randomNumeric(6));
	System.out.println(RandomStringUtils.random(2, true, true));
	
	String code="2c908eb85d360345015d36270a7d0001_001";
	System.out.println(code.substring(0,code.indexOf("_")+1));
	System.out.println(code);
}
}
