package test.uploadPoint;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dituhui.saas.framework.http.HttpClient;
import com.dituhui.saas.framework.http.HttpResult;
import com.dituhui.saas.framework.proxy.DthAPIResultInfo;
import com.dituhui.saas.framework.utils.StatusCode;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class UploadPointsByFile {
	
	private final static  String defaultUrl="{urlPrefix}/{interfaceName}/{methodName}"; //默认Url

	public static void main(String[] args) {
		getDates();

	}

	public static void getDates(){
		try {
			InputStream is = new FileInputStream("E:\\temp\\zt\\新疆分公司导入网点模板a30.xlsx");
			Map<String, Object> dataMaps=ExcelUtil.readExcel(is, "广州数据 - 副本.xlsx", -1);
			//得到EXCEL解析的结果
			List<List<String>> dataList=(List<List<String>>) dataMaps.get("datas");
            List<String> titleList = (List<String>) dataMaps.get("titles");
            
            String ak="8a04a77b4cbc865c014cc0b8dfc4001a";
    		String secret="230182dbca054883a1ddb40791f863b5";
    		String layerCode="a30";
            for(List<String> rows:dataList){
            	String address=rows.get(1);
            	List<Map<String,Object>> infos=Lists.newArrayList();
            	for(int i=1;i<titleList.size();i++){
            		if(StringUtils.equalsIgnoreCase(titleList.get(i), "经度")||StringUtils.equalsIgnoreCase(titleList.get(i), "纬度")){
            			continue;
            		}
            		Map<String,Object> map=Maps.newHashMap();
            		map.put("fieldName", titleList.get(i));
            		map.put("fieldValue", rows.get(i));
            		infos.add(map);
            	}
            	APIAddressMatchResult result=addressMatchNew("d84ab9adb4c04216b5f86f6d42156838", new APIAddressMatchParam("1",address), "SMC");
            	if(null!=result){
            		Map<String,String> params=Maps.newHashMap();
            		params.put("x", result.getX()+"");
            		params.put("y", result.getY()+"");
            		params.put("name", URLEncoder.encode(rows.get(0),"utf-8"));
            		params.put("layer_code", layerCode);
            		params.put("coord_type", "gcj02mc");
            		params.put("infos", URLEncoder.encode(JSONArray.toJSONString(infos),"utf-8"));
            		params.put("ak", ak);
            		
            		Map<String,String> params2=Maps.newHashMap();
            		params2.put("x", result.getX()+"");
            		params2.put("y", result.getY()+"");
            		params2.put("name", rows.get(0));
            		params2.put("layer_code", layerCode);
            		params2.put("coord_type", "gcj02mc");
            		params2.put("infos", JSONArray.toJSONString(infos));
            		params2.put("ak", ak);
            		
            		String sign=EncryptUtils.signRequest(params2, secret);
            		params.put("sign", sign);
            		String content=httpApiProxy_saas(ak,secret,"point","add",params);//TODO
            		System.out.println(content);
            	}
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static DthAPIResultInfo httpApiGetProxy2(String interfaceName,String methodName,Map<String,String> params){
	    // 获取URL参数
	    String urlParam=getUrlParam(params);
	    //包装URL请求
	    String requestUrl=wrapRequest("http://restapi.dituhui.com/v1",interfaceName,methodName,urlParam);
	    //调用前时间
	    long startTime=System.currentTimeMillis();
	    //发送请求
	    String content=null;
        try {
            content = IOUtils.toString(new URL(requestUrl), "utf-8");
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException("http request error[" + requestUrl + "]");
        }
        HttpResult result = new HttpResult();
        result.setStatusCode(200);
        result.setResult(content);
	    //返回响应结果
	    return formatDthApiCommonResult(result);
	}
	
	
	
	/**
	 * Saas
	 * @param interfaceName
	 * @param methodName
	 * @param params
	 * @return
	 * @see
	 */
	public static String httpApiProxy_saas(String ak,String secret,String interfaceName,String methodName,Map<String,String> params){
		
		// 包装URL请求
        String requestUrl = wrapRequest("http://saasapi.dituhui.com/v1",interfaceName, methodName, null);
        // 调用前时间
        long startTime = System.currentTimeMillis();

        // 发送请求
        HttpResult result = httpPostRequest2(requestUrl, params);
        String log = "url:" + requestUrl + ",statusCode:" + result.getStatusCode() + ",costTime:"
                + (System.currentTimeMillis() - startTime);
        if (200 != result.getStatusCode()) {
            log += " " + result.getResult();
        }
        return result.getResult().toString();
		
//	    // 获取URL参数
//	    String urlParam=getUrlParam(params);
//	    //包装URL请求
//	    String requestUrl=wrapRequest("http://saasapi.dituhui.com/v1",interfaceName,methodName,urlParam);
//	    //调用前时间
//	    long startTime=System.currentTimeMillis();
//	    //发送请求
//	    String content=null;
//        try {
//            content = IOUtils.toString(new URL(requestUrl), "utf-8");
//        } catch (Throwable e) {
//            e.printStackTrace();
//            throw new RuntimeException("http request error[" + requestUrl + "]");
//        }
//	    //返回响应结果
//	    return content;
	}
	
	
	/**
     * POST请求
     * @param url 请求URL
     * @param params 请求参数
     * @return 响应结果
     * @throws UnsupportedEncodingException
     */
    public static HttpResult httpPostRequest2(String urlPath, Map<String, String> paramMap) {
        HttpResult httpResponse = new HttpResult();
        try {
            // 建立连接
            URL url = new URL(urlPath);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            // 设置参数
            httpConn.setDoOutput(true); // 需要输出
            httpConn.setDoInput(true); // 需要输入
            httpConn.setUseCaches(false); // 不允许缓存
            httpConn.setRequestMethod("POST"); // 设置POST方式连接
            // httpConn.setConnectTimeout(60000);
            httpConn.setReadTimeout(120000);
            // 设置请求属性
            httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpConn.setRequestProperty("Connection", "Keep-Alive");// 维持长连接
            httpConn.setRequestProperty("Charset", "UTF-8");
            // 连接,也可以不用明文connect，使用下面的httpConn.getOutputStream()会自动connect
            httpConn.connect();
            // 建立输入流，向指向的URL传入参数
            DataOutputStream dos = new DataOutputStream(httpConn.getOutputStream());
            // 遍历传入的参数MAP
            String postparams = "";
            for (Map.Entry<String, String> entry : paramMap.entrySet()) {
                postparams += "&" + entry.getKey() + "=" + entry.getValue();
            }
            dos.writeBytes(postparams);
            dos.flush();
            dos.close();
            // 获得响应状态
            int resultCode = httpConn.getResponseCode();
            httpResponse.setStatusCode(resultCode);
            if (HttpURLConnection.HTTP_OK == resultCode) {
                String content = IOUtils.toString(httpConn.getInputStream(), "UTF-8");
                httpResponse.setResult(content);
            }
            httpConn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return httpResponse;
    }
	
	
	/**
	 * 对请求进行包装
	 * @param interfaceName 调用的接口名
	 * @param methodName 调用的方法名
	 * @param urlParam url参数
	 * @return 包装后的URL请求
	 */
	private static String wrapRequest(String urlPrefix,String interfaceName,String methodName,String urlParam){
		//组装请求URL
		String urlRequest=defaultUrl;
		urlRequest=urlRequest.replace("{urlPrefix}", urlPrefix);
		urlRequest=urlRequest.replace("{interfaceName}", interfaceName);
		urlRequest=urlRequest.replace("{methodName}", methodName);
		if((urlParam!=null) && (!urlParam.equals(""))){
			//如果url参数不为空则拼装
			urlRequest+="?"+urlParam;
		}
		return urlRequest;
	}
	
	/**
	 * 地图慧底层通用返回结果{"result":{"areaId":"edcc46eb60114fd990b8dee3d93676fe","success":true},"status":10000,"info":"OK"}
	 * @param httpResult
	 * @return 解析结果
	 * @see DthAPIResultInfo
	 */
	private static DthAPIResultInfo formatDthApiCommonResult(HttpResult httpResult){
		DthAPIResultInfo result=new DthAPIResultInfo();
		if(httpResult.getStatusCode()==200){
			result=JSONObject.parseObject(httpResult.getResult().toString(), DthAPIResultInfo.class);
		    try {
				if(result.getStatus().equals("10000")){
					if(org.springframework.util.StringUtils.isEmpty(result.getResult())){
						result.setSuccess(false);
					}else{
						if(result.getResult().contains("success")){
					    	JSONObject resultJson=JSONObject.parseObject(result.getResult());
							result.setSuccess(resultJson.getBooleanValue("success"));
						}
						else result.setSuccess(true);
					}
				}
			} catch (Exception e) {
				result.setSuccess(false);
				result.setStatus(StatusCode.EXCEPTION);
			}
		}else{
			result.setStatus(httpResult.getStatusCode()+"");
			result.setInfo(httpResult.getResult()==null?null:httpResult.getResult().toString());
		}
		return result;
	}
	
	 /**
     * 获取URL参数
     * @param params 参数MAP
     * @return url参数
     */
    private static  String getUrlParam(Map<String,String> params){
    	//URL参数
		String urlParam="";
		//获取版本号
		String key=(String)params.get("ak");
		urlParam+="&ak="+key;
		//遍历传入的参数MAP
		for (Map.Entry<String, String> entry : params.entrySet()) {
		 	 //如果不为版本号或KEY
			 if(!entry.getKey().equals("version") && !entry.getKey().equals("ak")){
				 //组装参数
				 urlParam+="&"+entry.getKey()+"="+entry.getValue();
			 }
		}
		return urlParam;
    }
    
    
    private static APIAddressMatchResult  addressMatchNew(String ak,APIAddressMatchParam address,String type){
    	APIAddressMatchResult result=null;
    	List<APIAddressMatchResult> resultList=new ArrayList<APIAddressMatchResult>();
		Map<String,String> paramMap=new HashMap<String,String>();
		paramMap.put("ak", ak);
		paramMap.put("addresses", URLEncoder.encode(JSONArray.toJSONString(Arrays.asList(address))));
//		if(StringUtils.isEmpty(type)){
//			type="SMC";
//		}
		paramMap.put("type", "SMC");
		DthAPIResultInfo  resultInfo=httpApiGetProxy2("oldaddrmatch", "geo", paramMap);
		if(resultInfo.isSuccess()){
			resultList=(List<APIAddressMatchResult>) JSONObject.parseArray(resultInfo.getResult(), APIAddressMatchResult.class);
			if(CollectionUtils.isNotEmpty(resultList)){
				result=resultList.get(0);
			}
		}
		return result;
	}
    
}
