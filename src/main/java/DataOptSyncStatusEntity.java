// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * DataOptSyncStatusEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="data_optsync_status"
    ,catalog="saas_biz"
)

public class DataOptSyncStatusEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String userId;
     private String dataId;
     private Short dataType;
     private Short optType;
     private Short syncStatus;
     private Short calculateStatus;
     private Timestamp updateTime;


    // Constructors

    /** default constructor */
    public DataOptSyncStatusEntity() {
    }

	/** minimal constructor */
    public DataOptSyncStatusEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public DataOptSyncStatusEntity(String id, String teamId, String userId, String dataId, Short dataType, Short optType, Short syncStatus, Short calculateStatus, Timestamp updateTime) {
        this.id = id;
        this.teamId = teamId;
        this.userId = userId;
        this.dataId = dataId;
        this.dataType = dataType;
        this.optType = optType;
        this.syncStatus = syncStatus;
        this.calculateStatus = calculateStatus;
        this.updateTime = updateTime;
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
    
    @Column(name="USER_ID", length=32)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="DATA_ID", length=32)

    public String getDataId() {
        return this.dataId;
    }
    
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }
    
    @Column(name="DATA_TYPE")

    public Short getDataType() {
        return this.dataType;
    }
    
    public void setDataType(Short dataType) {
        this.dataType = dataType;
    }
    
    @Column(name="OPT_TYPE")

    public Short getOptType() {
        return this.optType;
    }
    
    public void setOptType(Short optType) {
        this.optType = optType;
    }
    
    @Column(name="SYNC_STATUS")

    public Short getSyncStatus() {
        return this.syncStatus;
    }
    
    public void setSyncStatus(Short syncStatus) {
        this.syncStatus = syncStatus;
    }
    
    @Column(name="CALCULATE_STATUS")

    public Short getCalculateStatus() {
        return this.calculateStatus;
    }
    
    public void setCalculateStatus(Short calculateStatus) {
        this.calculateStatus = calculateStatus;
    }
    
    @Column(name="UPDATE_TIME", length=19)

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
   








}