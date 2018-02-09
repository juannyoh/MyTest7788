package com.util;

import java.io.Serializable;

/**
 * 图层权限实体
 *
 *
 */
public class APILayerRightInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 图层编码
	 */
	private String layerCode;
	
	/**
	 * 操作权限类型（1，2，3:管理，操作，查看）
	 */
	private Short optType;

	public String getLayerCode() {
		return layerCode;
	}

	public void setLayerCode(String layerCode) {
		this.layerCode = layerCode;
	}

	public Short getOptType() {
		return optType;
	}

	public void setOptType(Short optType) {
		this.optType = optType;
	}
	
	@Override
	public String toString() {
		return "[layerCode:"+layerCode+",optType:"+optType+"]";
	}
}
