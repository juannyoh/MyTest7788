// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * FendanLayerEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="fendan_layer"
    ,catalog="saas_biz"
)

public class FendanLayerEntity   implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
     private String teamId;
     private String name;
     private Timestamp createTime;
     private String userId;
     private Short layerType;


    // Constructors

    /** default constructor */
    public FendanLayerEntity() {
    }

	/** minimal constructor */
    public FendanLayerEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public FendanLayerEntity(String id, String teamId, String name, Timestamp createTime, String userId, Short layerType) {
        this.id = id;
        this.teamId = teamId;
        this.name = name;
        this.createTime = createTime;
        this.userId = userId;
        this.layerType = layerType;
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
    
    @Column(name="NAME", length=20)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="USER_ID", length=32)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="LAYER_TYPE")

    public Short getLayerType() {
        return this.layerType;
    }
    
    public void setLayerType(Short layerType) {
        this.layerType = layerType;
    }
   








}