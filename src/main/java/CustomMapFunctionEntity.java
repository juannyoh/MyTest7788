// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * CustomMapFunctionEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="custom_map_function"
    ,catalog="saas_biz"
)

public class CustomMapFunctionEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String name;
     private String funCode;
     private Short isMapadmin;
     private Short isMapmems;
     private Short isMapviews;
     private Short isLayeradmin;
     private Short isLayermems;
     private Short isLayerviews;
     private Short isClayermems;
     private Short isClayerviews;
     private String funGroup;
     private Short funStatus;
     private Timestamp createTime;
     private String createUserid;


    // Constructors

    /** default constructor */
    public CustomMapFunctionEntity() {
    }

	/** minimal constructor */
    public CustomMapFunctionEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public CustomMapFunctionEntity(String id, String teamId, String name, String funCode, Short isMapadmin, Short isMapmems, Short isMapviews, Short isLayeradmin, Short isLayermems, Short isLayerviews, Short isClayermems, Short isClayerviews, String funGroup, Short funStatus, Timestamp createTime, String createUserid) {
        this.id = id;
        this.teamId = teamId;
        this.name = name;
        this.funCode = funCode;
        this.isMapadmin = isMapadmin;
        this.isMapmems = isMapmems;
        this.isMapviews = isMapviews;
        this.isLayeradmin = isLayeradmin;
        this.isLayermems = isLayermems;
        this.isLayerviews = isLayerviews;
        this.isClayermems = isClayermems;
        this.isClayerviews = isClayerviews;
        this.funGroup = funGroup;
        this.funStatus = funStatus;
        this.createTime = createTime;
        this.createUserid = createUserid;
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
    
    @Column(name="NAME", length=100)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="FUN_CODE", length=100)

    public String getFunCode() {
        return this.funCode;
    }
    
    public void setFunCode(String funCode) {
        this.funCode = funCode;
    }
    
    @Column(name="IS_MAPADMIN")

    public Short getIsMapadmin() {
        return this.isMapadmin;
    }
    
    public void setIsMapadmin(Short isMapadmin) {
        this.isMapadmin = isMapadmin;
    }
    
    @Column(name="IS_MAPMEMS")

    public Short getIsMapmems() {
        return this.isMapmems;
    }
    
    public void setIsMapmems(Short isMapmems) {
        this.isMapmems = isMapmems;
    }
    
    @Column(name="IS_MAPVIEWS")

    public Short getIsMapviews() {
        return this.isMapviews;
    }
    
    public void setIsMapviews(Short isMapviews) {
        this.isMapviews = isMapviews;
    }
    
    @Column(name="IS_LAYERADMIN")

    public Short getIsLayeradmin() {
        return this.isLayeradmin;
    }
    
    public void setIsLayeradmin(Short isLayeradmin) {
        this.isLayeradmin = isLayeradmin;
    }
    
    @Column(name="IS_LAYERMEMS")

    public Short getIsLayermems() {
        return this.isLayermems;
    }
    
    public void setIsLayermems(Short isLayermems) {
        this.isLayermems = isLayermems;
    }
    
    @Column(name="IS_LAYERVIEWS")

    public Short getIsLayerviews() {
        return this.isLayerviews;
    }
    
    public void setIsLayerviews(Short isLayerviews) {
        this.isLayerviews = isLayerviews;
    }
    
    @Column(name="IS_CLAYERMEMS")

    public Short getIsClayermems() {
        return this.isClayermems;
    }
    
    public void setIsClayermems(Short isClayermems) {
        this.isClayermems = isClayermems;
    }
    
    @Column(name="IS_CLAYERVIEWS")

    public Short getIsClayerviews() {
        return this.isClayerviews;
    }
    
    public void setIsClayerviews(Short isClayerviews) {
        this.isClayerviews = isClayerviews;
    }
    
    @Column(name="FUN_GROUP", length=100)

    public String getFunGroup() {
        return this.funGroup;
    }
    
    public void setFunGroup(String funGroup) {
        this.funGroup = funGroup;
    }
    
    @Column(name="FUN_STATUS")

    public Short getFunStatus() {
        return this.funStatus;
    }
    
    public void setFunStatus(Short funStatus) {
        this.funStatus = funStatus;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="CREATE_USERID", length=100)

    public String getCreateUserid() {
        return this.createUserid;
    }
    
    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }
   








}