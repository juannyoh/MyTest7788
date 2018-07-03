// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * MessageInfoEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="message_info"
    ,catalog="saas_biz"
)

public class MessageInfoEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String mapId;
     private String msgContents;
     private String createUserid;
     private Timestamp createTime;
     private Short releaseStatus;


    // Constructors

    /** default constructor */
    public MessageInfoEntity() {
    }

	/** minimal constructor */
    public MessageInfoEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public MessageInfoEntity(String id, String teamId, String mapId, String msgContents, String createUserid, Timestamp createTime, Short releaseStatus) {
        this.id = id;
        this.teamId = teamId;
        this.mapId = mapId;
        this.msgContents = msgContents;
        this.createUserid = createUserid;
        this.createTime = createTime;
        this.releaseStatus = releaseStatus;
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
    
    @Column(name="MSG_CONTENTS", length=500)

    public String getMsgContents() {
        return this.msgContents;
    }
    
    public void setMsgContents(String msgContents) {
        this.msgContents = msgContents;
    }
    
    @Column(name="CREATE_USERID", length=32)

    public String getCreateUserid() {
        return this.createUserid;
    }
    
    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="RELEASE_STATUS")

    public Short getReleaseStatus() {
        return this.releaseStatus;
    }
    
    public void setReleaseStatus(Short releaseStatus) {
        this.releaseStatus = releaseStatus;
    }
   








}