package test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;

public class Ttttttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEnum en=TestEnum.DELETE;
		System.out.println(en.name()+"---"+en.getOptCode());
		
		String xxx="1_w";
		System.out.println(xxx.substring(0,xxx.indexOf("_")));
		
		Integer parts[]={2,4,5};
		
		System.out.println(StringUtils.join(parts,","));
		
		Point[] points=new Point[3];
		points[0]=new Point(1,2);
		points[1]=new Point(3,4);
		points[2]=new Point(5,6);
		System.out.println(StringUtils.join(points,";"));
		
//		Map<String ,String> map=new HashMap<String ,String>();
//		map.put("sfdf", "fd");
//		map.put("htrtr", "ftt");
//		System.out.println(JSONObject.toJSONString(map));
	}

}

class Point implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * x×ø±ê
	 */
	private double x;
	/**
	 * y×ø±ê
	 */
	private double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Point() {
		super();
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return x + "," + y;
	}
}
