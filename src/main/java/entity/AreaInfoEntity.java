package entity;
// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * AreaInfoEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="area_info"
    ,catalog="saas_biz"
)

public class AreaInfoEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String layerId;
     private String layerCode;
     private String code;
     private String name;
     private String areaDesc;
     private Short areaStatus;
     private String relationArea;
     private Timestamp createTime;
     private Timestamp updateTime;
     private String userAccount;


    // Constructors

    /** default constructor */
    public AreaInfoEntity() {
    }

	/** minimal constructor */
    public AreaInfoEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public AreaInfoEntity(String id, String teamId, String layerId, String layerCode, String code, String name, String areaDesc, Short areaStatus, String relationArea, Timestamp createTime, Timestamp updateTime, String userAccount) {
        this.id = id;
        this.teamId = teamId;
        this.layerId = layerId;
        this.layerCode = layerCode;
        this.code = code;
        this.name = name;
        this.areaDesc = areaDesc;
        this.areaStatus = areaStatus;
        this.relationArea = relationArea;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.userAccount = userAccount;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID", unique=true, nullable=false, length=32)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="TEAM_ID", length=32)

    public String getTeamId() {
        return this.teamId;
    }
    
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
    
    @Column(name="LAYER_ID", length=32)

    public String getLayerId() {
        return this.layerId;
    }
    
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }
    
    @Column(name="LAYER_CODE", length=100)

    public String getLayerCode() {
        return this.layerCode;
    }
    
    public void setLayerCode(String layerCode) {
        this.layerCode = layerCode;
    }
    
    @Column(name="CODE", length=100)

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    @Column(name="NAME", length=50)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="AREA_DESC", length=50)

    public String getAreaDesc() {
        return this.areaDesc;
    }
    
    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }
    
    @Column(name="AREA_STATUS")

    public Short getAreaStatus() {
        return this.areaStatus;
    }
    
    public void setAreaStatus(Short areaStatus) {
        this.areaStatus = areaStatus;
    }
    
    @Column(name="RELATION_AREA", length=32)

    public String getRelationArea() {
        return this.relationArea;
    }
    
    public void setRelationArea(String relationArea) {
        this.relationArea = relationArea;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="UPDATE_TIME", length=19)

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
    
    @Column(name="USER_ACCOUNT", length=32)

    public String getUserAccount() {
        return this.userAccount;
    }
    
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
   








}