// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * CustomMethodTeamMappingEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="custom_method_team_mapping"
    ,catalog="saas_base"
)

public class CustomMethodTeamMappingEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String methodId;
     private Timestamp createTime;


    // Constructors

    /** default constructor */
    public CustomMethodTeamMappingEntity() {
    }

	/** minimal constructor */
    public CustomMethodTeamMappingEntity(String id, String teamId, String methodId) {
        this.id = id;
        this.teamId = teamId;
        this.methodId = methodId;
    }
    
    /** full constructor */
    public CustomMethodTeamMappingEntity(String id, String teamId, String methodId, Timestamp createTime) {
        this.id = id;
        this.teamId = teamId;
        this.methodId = methodId;
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
    
    @Column(name="TEAM_ID", nullable=false, length=32)

    public String getTeamId() {
        return this.teamId;
    }
    
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
    
    @Column(name="METHOD_ID", nullable=false, length=32)

    public String getMethodId() {
        return this.methodId;
    }
    
    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
   








}