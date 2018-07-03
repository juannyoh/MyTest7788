// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * UserMapInfoEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user_map_info"
    ,catalog="saas_biz"
)

public class UserMapInfoEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String mapId;
     private String userId;
     private Short optType;
     private Timestamp updateTime;


    // Constructors

    /** default constructor */
    public UserMapInfoEntity() {
    }

	/** minimal constructor */
    public UserMapInfoEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public UserMapInfoEntity(String id, String teamId, String mapId, String userId, Short optType, Timestamp updateTime) {
        this.id = id;
        this.teamId = teamId;
        this.mapId = mapId;
        this.userId = userId;
        this.optType = optType;
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
    
    @Column(name="MAP_ID", length=32)

    public String getMapId() {
        return this.mapId;
    }
    
    public void setMapId(String mapId) {
        this.mapId = mapId;
    }
    
    @Column(name="USER_ID", length=32)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="OPT_TYPE")

    public Short getOptType() {
        return this.optType;
    }
    
    public void setOptType(Short optType) {
        this.optType = optType;
    }
    
    @Column(name="UPDATE_TIME", length=19)

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
   








}