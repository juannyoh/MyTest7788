// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * UserTeamMonitorEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user_team_monitor"
    ,catalog="saas_biz"
)

public class UserTeamMonitorEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String mapId;
     private String userId;
     private Short enable;
     private Timestamp createTime;
     private Timestamp updateTime;


    // Constructors

    /** default constructor */
    public UserTeamMonitorEntity() {
    }

	/** minimal constructor */
    public UserTeamMonitorEntity(String id, String teamId, String mapId, String userId, Timestamp createTime) {
        this.id = id;
        this.teamId = teamId;
        this.mapId = mapId;
        this.userId = userId;
        this.createTime = createTime;
    }
    
    /** full constructor */
    public UserTeamMonitorEntity(String id, String teamId, String mapId, String userId, Short enable, Timestamp createTime, Timestamp updateTime) {
        this.id = id;
        this.teamId = teamId;
        this.mapId = mapId;
        this.userId = userId;
        this.enable = enable;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="id", unique=true, nullable=false, length=32)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="team_id", nullable=false, length=32)

    public String getTeamId() {
        return this.teamId;
    }
    
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
    
    @Column(name="map_id", nullable=false, length=32)

    public String getMapId() {
        return this.mapId;
    }
    
    public void setMapId(String mapId) {
        this.mapId = mapId;
    }
    
    @Column(name="user_id", nullable=false, length=32)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="enable")

    public Short getEnable() {
        return this.enable;
    }
    
    public void setEnable(Short enable) {
        this.enable = enable;
    }
    
    @Column(name="create_time", nullable=false, length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="update_time", length=19)

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
   








}