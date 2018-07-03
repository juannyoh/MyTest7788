/**
 * 
 */
package test;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.dituhui.saas.framework.utils.SaasStatusCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;

/**
 * 图层信息
 */
public class LayerInfo extends SaasStatusCode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 唯一ID
	 */
	private String id;
	/**
	 * 图层编码
	 */
	private String code;
	/**
	 * 图层名称
	 */
	private String name;
	/**
	 * 父图层ID
	 */
	private String parentId;
	
	
	/**
	 * 图层级别,�?��六级
	 */
	private Short depth=1;
	
	/**
	 * 图层类型�?�?�?:区划，点，路线）
	 */
	private Short type=1;

	/**
	 * 用户图层权限
	 */
	private int userOptType=3;
	
	/**
	 * 子图层数
	 */
	private long layerCount=0;
	
	/**
	 * 区划�?	 */
	private long dataCount=0;
	
	/**
	 * 待审核数
	 */
	private long dataAuditCount=0;
	
	/**
	 * 图层下级属�?�? 无，1：图层，2：区划）
	 */
	private int  childType=0;
	
	/**
	 * 子图�?	 */
	List<LayerInfo> childLayers;
	
	
	/**
	 * 眼睛关闭状�?�?关闭�?睁眼�?	 */
	private Integer eyeStatus=0;
	
	/**
	 * 是否勾�?�?未勾选，1勾�?�?	 */
	private Integer checkStatus=0;
	
	
	
	
	public Integer getCheckStatus() {
		return checkStatus;
	}

	/**
	 * 是否勾�?�?未勾选，1勾�?�?	 * @param checkStatus
	 * @see
	 */
	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Integer getEyeStatus() {
		return eyeStatus;
	}
	
	/**
	 * @param 眼睛关闭状�?�?关闭�?睁眼�?	 * @see
	 */
	public void setEyeStatus(Integer eyeStatus) {
		this.eyeStatus = eyeStatus;
	}
	/**
	 * @return the childLayers
	 */
	public List<LayerInfo> getChildLayers() {
	    return childLayers;
	}
	/**
	 * 添加集合,不是覆盖
	 * @param childLayers the childLayers to set
	 */
    public void setChildLayers(List<LayerInfo> childLayers) {
        if (this.childLayers == null) {
            this.childLayers = Lists.newArrayList();
        }
        if(CollectionUtils.isNotEmpty(childLayers)){
        	 this.childLayers.addAll(childLayers);
        }
    }
	/**
	 * @return the layerCount
	 */
	public long getLayerCount() {
		return layerCount;
	}
	/**
	 * @param layerCount the layerCount to set
	 */
	public void setLayerCount(long layerCount) {
		this.layerCount = layerCount;
	}
	/**
	 * @return the areaCount
	 */
	public long getDataCount() {
		return dataCount;
	}
	/**
	 * @param areaCount the areaCount to set
	 */
	public void setDataCount(long dataCount) {
		this.dataCount = dataCount;
	}
	
	public long getDataAuditCount() {
        return dataAuditCount;
    }

    public void setDataAuditCount(long dataAuditCount) {
        this.dataAuditCount = dataAuditCount;
    }

    /**
	 * @return the childType
	 */
	public int getChildType() {
		return childType;
	}
	/**
	 * @param childType the childType to set
	 */
	public void setChildType(int childType) {
		this.childType = childType;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the parentId
	 */
	@JsonIgnore
	public String getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	/**
	 * @return the depth
	 */
	public Short getDepth() {
		return depth;
	}
	/**
	 * @param depth the depth to set
	 */
	public void setDepth(Short depth) {
		this.depth = depth;
	}

	/**
	 * @return the type
	 */
	public Short getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Short type) {
		this.type = type;
	}


	/**
	 * @return the userOptType
	 */
	public int getUserOptType() {
		return userOptType;
	}
	/**
	 * @param userOptType the userOptType to set
	 */
	public void setUserOptType(int userOptType) {
		this.userOptType = userOptType;
	}
	
	/**
	 * 样式信息
	 */
	private List<SaasStatusCode> style;

	public List<SaasStatusCode> getStyle() {
		return style;
	}
	public void setStyle(List<SaasStatusCode> style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "LayerInfo{" +
				"statusCode='" + statusCode + '\'' +
				", id='" + id + '\'' +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				", parentId='" + parentId + '\'' +
				", depth=" + depth +
				", type=" + type +
				", userOptType=" + userOptType +
				", layerCount=" + layerCount +
				", dataCount=" + dataCount +
				", childType=" + childType +
				", childLayers=" + childLayers +
				", style=" + style +
				'}';
	}
	
	public LayerInfo() {
	}
	
	public LayerInfo(String id, String code, Short type) {
		this.id = id;
		this.code = code;
		this.type = type;
		this.dataCount=1;//默认1
	}
	
	public LayerInfo(String id, String code, Short type,Short depth) {
		this.id = id;
		this.code = code;
		this.type = type;
		this.depth=depth;
		this.dataCount=1;//默认1
	}
}
