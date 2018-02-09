// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * AreaPointMappingEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="area_point_mapping"
    ,catalog="saas_biz"
)

public class AreaPointMappingEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String areaId;
     private String pointId;
     private Timestamp createTime;


    // Constructors

    /** default constructor */
    public AreaPointMappingEntity() {
    }

	/** minimal constructor */
    public AreaPointMappingEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public AreaPointMappingEntity(String id, String teamId, String areaId, String pointId, Timestamp createTime) {
        this.id = id;
        this.teamId = teamId;
        this.areaId = areaId;
        this.pointId = pointId;
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
    
    @Column(name="AREA_ID", length=32)

    public String getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
    
    @Column(name="POINT_ID", length=32)

    public String getPointId() {
        return this.pointId;
    }
    
    public void setPointId(String pointId) {
        this.pointId = pointId;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
   








}