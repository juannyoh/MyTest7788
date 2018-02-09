package test.geojson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONObject;

public class TestGeoJson {
	
	public static String geoJson(){
		String json=null;
		List<List<String>> coordinates=new ArrayList<List<String>>();
		List<String> s1=Arrays.asList("11","22","33");
		List<String> s2=Arrays.asList("55","66","77");
		List<String> s3=Arrays.asList("gg","dd","tt");
		coordinates.add(s1);
		coordinates.add(s2);
		coordinates.add(s3);
		
		json=com.alibaba.fastjson.JSONObject.toJSONString(coordinates);
		return json;
	}
	
	public static void main(String[] args) {
		System.out.println(geoJson());
	}
	
//	public static String geoToJson(String wkt){  
//        String json = null;  
//        try{  
//            WKTReader reader = new WKTReader();  
//            Geometry geometry = reader.read(wkt);  
//            StringWriter writer = new StringWriter();  
//            GeometryJSON g = new GeometryJSON();  
//            g.write(geometry,writer);  
//            json = writer.toString();  
//        }catch(Exception e){  
//            e.printStackTrace();  
//        }  
//        return json;  
//    }  
}
