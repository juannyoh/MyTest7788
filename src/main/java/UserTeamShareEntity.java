// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * UserTeamShareEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user_team_share"
    ,catalog="saas_biz"
)

public class UserTeamShareEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String userId;
     private String layerTree;
     private Short linkType;
     private String linkSecret;
     private Timestamp createTime;


    // Constructors

    /** default constructor */
    public UserTeamShareEntity() {
    }

	/** minimal constructor */
    public UserTeamShareEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public UserTeamShareEntity(String id, String teamId, String userId, String layerTree, Short linkType, String linkSecret, Timestamp createTime) {
        this.id = id;
        this.teamId = teamId;
        this.userId = userId;
        this.layerTree = layerTree;
        this.linkType = linkType;
        this.linkSecret = linkSecret;
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
    
    @Column(name="USER_ID", length=32)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="LAYER_TREE", length=65535)

    public String getLayerTree() {
        return this.layerTree;
    }
    
    public void setLayerTree(String layerTree) {
        this.layerTree = layerTree;
    }
    
    @Column(name="LINK_TYPE")

    public Short getLinkType() {
        return this.linkType;
    }
    
    public void setLinkType(Short linkType) {
        this.linkType = linkType;
    }
    
    @Column(name="LINK_SECRET", length=10)

    public String getLinkSecret() {
        return this.linkSecret;
    }
    
    public void setLinkSecret(String linkSecret) {
        this.linkSecret = linkSecret;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
   








}