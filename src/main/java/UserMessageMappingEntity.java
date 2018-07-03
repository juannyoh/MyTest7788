// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * UserMessageMappingEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user_message_mapping"
    ,catalog="saas_biz"
)

public class UserMessageMappingEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String mapId;
     private String userId;
     private String messageId;
     private Short readStatus;
     private Timestamp createTime;


    // Constructors

    /** default constructor */
    public UserMessageMappingEntity() {
    }

	/** minimal constructor */
    public UserMessageMappingEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public UserMessageMappingEntity(String id, String teamId, String mapId, String userId, String messageId, Short readStatus, Timestamp createTime) {
        this.id = id;
        this.teamId = teamId;
        this.mapId = mapId;
        this.userId = userId;
        this.messageId = messageId;
        this.readStatus = readStatus;
        this.createTime = createTime;
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
    
    @Column(name="MESSAGE_ID", length=32)

    public String getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    @Column(name="READ_STATUS")

    public Short getReadStatus() {
        return this.readStatus;
    }
    
    public void setReadStatus(Short readStatus) {
        this.readStatus = readStatus;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
   








}