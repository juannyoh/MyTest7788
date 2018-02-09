package test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.util.JsonUtil;


public class testHttpClient {
	
		static String baseurl="http://e.dituhui.com/egispapi/1.0/cm/coor_conv";
		
		public static final String DEF_CHATSET = "UTF-8";
	  public static final int DEF_CONN_TIMEOUT = 30000;
	  public static final int DEF_READ_TIMEOUT = 30000;
	  public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";

	  // 閰嶇疆鎮ㄧ敵璇风殑KEY
	  public static final String APPKEY = "JH09ecde8d2565def24c0974471eb25255";
		  
	    /** 
	     * @param args 
	     */  
	    public static void main(String[] args) {  
	      
	       /* String coords="103.84,36.06";  
	        String from="GPS";  
	        String to="SMLL";  
	        String ret=sendSms(coords ,from,to);  
	        System.out.println(ret);  
	  
	        if(ret.indexOf("澶辫触")<0)  
	        {  
	            System.out.println("鎴愬姛鍙戦�");  
	        }  
	        else  
	        {  
	            System.out.println("澶辫触鍙戦�");  
	        } */ 
//	        String admincodeurl="http://192.168.10.251:8042/egispapi/1.0/cm/getAdminElements";
//	        
//	        
//	        Object obj=getAdminElements(admincodeurl,"510000","2","40288e9f483f48e501483f48eb060000");
//	        System.out.println(obj);
	          
	         sendMsg("13608182850","125421");
	  
	    } 
	    
	    
	  
	    
	    /**
	     * 鍙戦�鐭俊
	     * @param tel
	     * @param code
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
      public static void sendMsg(String tel,String code){
	      HttpClient httpclient = new DefaultHttpClient(); 
	      String result = null;
	      String url = "http://v.juhe.cn/sms/send";// 璇锋眰鎺ュ彛鍦板潃
	      Map params = new HashMap();// 璇锋眰鍙傛暟
	      params.put("mobile", tel);// 鎺ユ敹鐭俊鐨勬墜鏈哄彿鐮�
	      params.put("tpl_id", "1304");// 鐭俊妯℃澘ID锛岃鍙傝�涓汉涓績鐭俊妯℃澘璁剧疆
	      params.put("tpl_value", "#code#="+code);// 鍙橀噺鍚嶅拰鍙橀噺鍊煎銆傚鏋滀綘鐨勫彉閲忓悕鎴栬�鍙橀噺鍊间腑甯︽湁#&=涓殑浠绘剰涓�釜鐗规畩绗﹀彿锛岃鍏堝垎鍒繘琛寀rlencode缂栫爜鍚庡啀浼犻�锛�a
	                    // href="http://www.juhe.cn/news/index/id/50"
	                    // target="_blank">璇︾粏璇存槑></a>
	      params.put("key", APPKEY);// 搴旂敤APPKEY(搴旂敤璇︾粏椤垫煡璇�
	      params.put("dtype", "json");// 杩斿洖鏁版嵁鐨勬牸寮�xml鎴杍son锛岄粯璁son
	      
	      url = url + "?" + urlencode(params);
	      
	      HttpGet httpget=new HttpGet(url);

	      try {
	        
	        HttpResponse resp=  httpclient.execute(httpget);
	        
	        result =EntityUtils.toString(resp.getEntity());  
	        JSONObject object = JSONObject.fromObject(result);
	        if (object.getInt("error_code") == 0) {
	          System.out.println(object.get("result"));
	        } else {
	          System.out.println(object.get("error_code") + ":"
	              + object.get("reason"));
	        }
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	     
	    }
	    
	 // 灏唌ap鍨嬭浆涓鸿姹傚弬鏁板瀷
	    public static String urlencode(Map<String, Object> data) {
	      StringBuilder sb = new StringBuilder();
	      for (Map.Entry i : data.entrySet()) {
	        try {
	          sb.append(i.getKey()).append("=")
	              .append(URLEncoder.encode(i.getValue() + "", "UTF-8"))
	              .append("&");
	        } catch (UnsupportedEncodingException e) {
	          e.printStackTrace();
	        }
	      }
	      return sb.toString();
	    }
	    
	      
	      
	  
	    public static String sendSms(String uid,String title,String content){  
	        HttpClient httpclient = new DefaultHttpClient();  
	        String smsUrl=baseurl;  
	        HttpPost httppost = new HttpPost(smsUrl);  
	        String strResult = "";  
	          
	        try {  
	                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();  
	                JSONObject jobj = new JSONObject();  
	                jobj.put("coords", uid);  
	                jobj.put("from", title);  
	                jobj.put("to",content);  
	                  
	                nameValuePairs.add(new BasicNameValuePair("key", "40288fd94add378d014add37a3e00000"));
	                nameValuePairs.add(new BasicNameValuePair("param", getStringFromJson(jobj)));  
	                httppost.addHeader("Content-type", "application/x-www-form-urlencoded");  
	                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs,"UTF-8"));  
	               
	                System.out.println(httppost.toString());
	                
	                HttpResponse response = httpclient.execute(httppost);  
	                if (response.getStatusLine().getStatusCode() == 200) {  
	                    /*璇昏繑鍥炴暟鎹�/  
	                    String conResult = EntityUtils.toString(response.getEntity());  
	                    /*JSONObject sobj =getJsonObject(conResult);  
	                    String result = sobj.getString("result");  
	                    
	                    
	                    JSONObject sobj2 = getJsonObject(result);  
	                    String result2 = sobj2.getString("results"); 
	                    
	                    JSONObject sobj3 = getJsonObject(result2);  
	                    String result3 = sobj3.getString("coords"); 
	                    
	                    Object[] obj=getJsonToArray(result3);*/
	                    
//	                    Object[] resultobj=getJsonObject(conResult).getJSONObject("result")
//	                    			.getJSONObject("results").getJSONArray("coords").toArray();
//	                    
//	                    for(int i=0;i<resultobj.length;i++){
//	                    	JSONObject jsonObjects =(JSONObject)resultobj[i];
//	                    	System.out.println(jsonObjects.get("x")+"-------"+jsonObjects.get("y"));
//	                    }
	                    
	                } else {  
	                    String err = response.getStatusLine().getStatusCode()+"";  
	                    strResult += "鍙戦�澶辫触:"+err;  
	                }  
	        } catch (ClientProtocolException e) {  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	          
	        return strResult;  
	    }  
	  
	      
	    private static String getStringFromJson(JSONObject adata) {  
	        StringBuffer sb = new StringBuffer();  
	        sb.append("{");  
	        for(Object key:adata.keySet()){  
	            sb.append("\""+key+"\":\""+adata.get(key)+"\",");  
	        }  
	        String rtn = sb.toString().substring(0, sb.toString().length()-1)+"}";  
	        return rtn;  
	    } 
	    
	    

		/**
	     * 浠巎son鏁扮粍涓緱鍒扮浉搴攋ava鏁扮粍
	     * JSONArray涓嬬殑toArray()鏂规硶鐨勪娇鐢�
	     * @param str
	     * @return
	     */
	     public static Object[] getJsonToArray(String str) {
	         JSONArray jsonArray = JSONArray.fromObject(str);
	         return jsonArray.toArray();
	     }
	     
	     public static JSONObject getJsonObject(String str) {
	    	 JSONObject jsonArray = JSONObject.fromObject(str);
	         return jsonArray;
	     }
	     
	     
	     public static Object getAdminElements(String url,String admincode,String levelstr,String key){
	 		HttpClient httpclient = new DefaultHttpClient();
	 		String smsUrl = url;
	 		/*smsUrl=smsUrl.replaceAll("#admincode#", admincode);
	 		smsUrl=smsUrl.replaceAll("#levelstr#", levelstr);
	 		smsUrl=smsUrl.replaceAll("#key#", key);*/
	 		HttpPost httppost = new HttpPost(smsUrl);
	 		//HttpGet httpget=new HttpGet(smsUrl);
	 		
	 		Object[] resultobj=null;
	 		try {
	 			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
	 			JSONObject obj = new JSONObject();
	 			obj.put("admincode", admincode);
	 			obj.put("levelstr", levelstr);

	 			nameValuePairs.add(new BasicNameValuePair("key", key));
	 			nameValuePairs.add(new BasicNameValuePair("param", obj.toString()));
	 			httppost.addHeader("Content-type","application/x-www-form-urlencoded");
	 			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));

	 			HttpResponse response = httpclient.execute(httppost);
	 			//HttpResponse response = httpclient.execute(httpget);
	 			if (response.getStatusLine().getStatusCode() == 200) {
	 				/* 璇昏繑鍥炴暟鎹�*/
	 				String conResult = EntityUtils.toString(response.getEntity());
	 				JSONObject jsonresult = JsonUtil.getJsonObject(conResult);
	 				if(jsonresult!=null&&jsonresult.getBoolean("success")){
	 					resultobj = JsonUtil.getJsonObject(conResult).getJSONObject("result")
	 							.getJSONArray("results").toArray();
	 				}
	 			}
	 		} catch (Exception e) {
//	 			System.out.println("璋冪敤鍦板潃瑙ｆ瀽API澶辫触锛�+e);
	 		}
	 		return resultobj;
	 	}
}
