// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * LineInfoStyle entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="line_info"
    ,catalog="saas_biz"
)

public class LineInfoStyle  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String layerId;
     private String layerCode;
     private String code;
     private String name;
     private String lineDesc;
     private Short lineStatus;
     private String linePoints;
     private Timestamp createTime;
     private Timestamp updateTime;
     private String userId;


    // Constructors

    /** default constructor */
    public LineInfoStyle() {
    }

	/** minimal constructor */
    public LineInfoStyle(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public LineInfoStyle(String id, String teamId, String layerId, String layerCode, String code, String name, String lineDesc, Short lineStatus, String linePoints, Timestamp createTime, Timestamp updateTime, String userId) {
        this.id = id;
        this.teamId = teamId;
        this.layerId = layerId;
        this.layerCode = layerCode;
        this.code = code;
        this.name = name;
        this.lineDesc = lineDesc;
        this.lineStatus = lineStatus;
        this.linePoints = linePoints;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.userId = userId;
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
    
    @Column(name="LINE_DESC", length=50)

    public String getLineDesc() {
        return this.lineDesc;
    }
    
    public void setLineDesc(String lineDesc) {
        this.lineDesc = lineDesc;
    }
    
    @Column(name="LINE_STATUS")

    public Short getLineStatus() {
        return this.lineStatus;
    }
    
    public void setLineStatus(Short lineStatus) {
        this.lineStatus = lineStatus;
    }
    
    @Column(name="LINE_POINTS", length=65535)

    public String getLinePoints() {
        return this.linePoints;
    }
    
    public void setLinePoints(String linePoints) {
        this.linePoints = linePoints;
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
    
    @Column(name="USER_ID", length=32)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
   








}