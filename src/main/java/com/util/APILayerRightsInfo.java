package com.util;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.dituhui.saas.framework.http.HttpClient;
import com.dituhui.saas.framework.http.HttpResult;
import com.google.common.collect.Maps;


/**
 * 图层权限实体类
 *
 *
 */
public class APILayerRightsInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 是否清空图层权限
	 */
	private Boolean isClear;
	
	/**
	 * 图层权限明细
	 */
	List<APILayerRightInfo> rights;

	public Boolean getIsClear() {
		return isClear;
	}

	public void setIsClear(Boolean isClear) {
		this.isClear = isClear;
	}

	public List<APILayerRightInfo> getRights() {
		return rights;
	}

	public void setRights(List<APILayerRightInfo> rights) {
		this.rights = rights;
	}
	
	
	public static void main(String[] args) {
		
		
		APILayerRightInfo right=new APILayerRightInfo();
		right.setLayerCode("001");
		right.setOptType((short)1);
		
		APILayerRightsInfo aa=new APILayerRightsInfo();
		aa.setIsClear(false);
		aa.setRights(Arrays.asList(right));
		//组装请求URL
		String urlRequest="http://114.55.43.0:16907/v1/user/update";
		Map<String,Object> urlParam=Maps.newHashMap();
		
		urlParam.put("layer_rights", JSONObject.toJSONString(aa));
		
		 HttpResult result=null;
		try {
			result = HttpClient.httpGetRequest(urlRequest, urlParam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        String log = "url:" + urlRequest + ",statusCode:" + result.getStatusCode() + ",costTime:"
	                + (System.currentTimeMillis() - 0);
	        if (200 != result.getStatusCode()) {
	            log += " " + result.getResult();
	        }
	        System.out.println(log);
		
		System.out.println(JSONObject.toJSONString(aa));
		
	}
}
