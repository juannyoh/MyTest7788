// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * AreaAuditInfoEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="area_audit_info"
    ,catalog="saas_biz"
)

public class AreaAuditInfoEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String layerId;
     private String layerCode;
     private String newId;
     private String optType;
     private String oldIds;
     private Short oldType;
     private Short auditStatus;
     private String splitPoints;
     private String mappingIds;
     private Timestamp createTime;
     private Timestamp updateTime;
     private String cuserId;


    // Constructors

    /** default constructor */
    public AreaAuditInfoEntity() {
    }

	/** minimal constructor */
    public AreaAuditInfoEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public AreaAuditInfoEntity(String id, String teamId, String layerId, String layerCode, String newId, String optType, String oldIds, Short oldType, Short auditStatus, String splitPoints, String mappingIds, Timestamp createTime, Timestamp updateTime, String cuserId) {
        this.id = id;
        this.teamId = teamId;
        this.layerId = layerId;
        this.layerCode = layerCode;
        this.newId = newId;
        this.optType = optType;
        this.oldIds = oldIds;
        this.oldType = oldType;
        this.auditStatus = auditStatus;
        this.splitPoints = splitPoints;
        this.mappingIds = mappingIds;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.cuserId = cuserId;
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
    
    @Column(name="NEW_ID", length=32)

    public String getNewId() {
        return this.newId;
    }
    
    public void setNewId(String newId) {
        this.newId = newId;
    }
    
    @Column(name="OPT_TYPE", length=50)

    public String getOptType() {
        return this.optType;
    }
    
    public void setOptType(String optType) {
        this.optType = optType;
    }
    
    @Column(name="OLD_IDS", length=500)

    public String getOldIds() {
        return this.oldIds;
    }
    
    public void setOldIds(String oldIds) {
        this.oldIds = oldIds;
    }
    
    @Column(name="OLD_TYPE")

    public Short getOldType() {
        return this.oldType;
    }
    
    public void setOldType(Short oldType) {
        this.oldType = oldType;
    }
    
    @Column(name="AUDIT_STATUS")

    public Short getAuditStatus() {
        return this.auditStatus;
    }
    
    public void setAuditStatus(Short auditStatus) {
        this.auditStatus = auditStatus;
    }
    
    @Column(name="SPLIT_POINTS", length=2000)

    public String getSplitPoints() {
        return this.splitPoints;
    }
    
    public void setSplitPoints(String splitPoints) {
        this.splitPoints = splitPoints;
    }
    
    @Column(name="MAPPING_IDS", length=1000)

    public String getMappingIds() {
        return this.mappingIds;
    }
    
    public void setMappingIds(String mappingIds) {
        this.mappingIds = mappingIds;
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
    
    @Column(name="CUSER_ID", length=32)

    public String getCuserId() {
        return this.cuserId;
    }
    
    public void setCuserId(String cuserId) {
        this.cuserId = cuserId;
    }
   








}