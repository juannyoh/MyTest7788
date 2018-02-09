// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * NetPointInfoEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="netpoint_info"
    ,catalog="saas_biz"
)

public class NetPointInfoEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String layerId;
     private String layerCode;
     private String code;
     private String name;
     private String pointDesc;
     private String address;
     private Double x;
     private Double y;
     private Short status;
     private Timestamp createDate;
     private Timestamp updateTime;
     private String userAccount;


    // Constructors

    /** default constructor */
    public NetPointInfoEntity() {
    }

	/** minimal constructor */
    public NetPointInfoEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public NetPointInfoEntity(String id, String teamId, String layerId, String layerCode, String code, String name, String pointDesc, String address, Double x, Double y, Short status, Timestamp createDate, Timestamp updateTime, String userAccount) {
        this.id = id;
        this.teamId = teamId;
        this.layerId = layerId;
        this.layerCode = layerCode;
        this.code = code;
        this.name = name;
        this.pointDesc = pointDesc;
        this.address = address;
        this.x = x;
        this.y = y;
        this.status = status;
        this.createDate = createDate;
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
    
    @Column(name="POINT_DESC", length=50)

    public String getPointDesc() {
        return this.pointDesc;
    }
    
    public void setPointDesc(String pointDesc) {
        this.pointDesc = pointDesc;
    }
    
    @Column(name="ADDRESS", length=100)

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="X", precision=38, scale=16)

    public Double getX() {
        return this.x;
    }
    
    public void setX(Double x) {
        this.x = x;
    }
    
    @Column(name="Y", precision=38, scale=16)

    public Double getY() {
        return this.y;
    }
    
    public void setY(Double y) {
        this.y = y;
    }
    
    @Column(name="STATUS")

    public Short getStatus() {
        return this.status;
    }
    
    public void setStatus(Short status) {
        this.status = status;
    }
    
    @Column(name="CREATE_DATE", length=19)

    public Timestamp getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
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