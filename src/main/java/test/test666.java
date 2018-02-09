package test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class test666 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(URLDecoder.decode("http://saas.dituhui.com:9090/v1/fendan?&ak=4d9a25ae3c844c40b18e44c837971c7c&addresses=%5B%7B%22address%22%3A%22%E5%9B%9B%E5%B7%9D%E7%9C%81%E6%88%90%E9%83%BD%E5%B8%82%E9%94%A6%E6%B1%9F%E5%8C%BA%E5%A4%A7%E7%94%B0%E5%9D%8E%E8%A1%97162%E8%9C%80%E9%83%BD%E8%8A%B1%E5%9B%AD%22%2C%22id%22%3A%22111%22%7D%5D&coord_type=gcj02&t=1495761828834&layercodes=&needdistrict=false&area_fields=frre%2C%E5%90%8D%E7%A7%B0&_=1495757932946","utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
