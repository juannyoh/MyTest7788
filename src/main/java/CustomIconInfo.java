// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * CustomIconInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="custom_icon_info"
    ,catalog="oytest"
)

public class CustomIconInfo  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String userId;
     private String iconPath;
     private Integer width;
     private Integer height;
     private Timestamp createTime;


    // Constructors

    /** default constructor */
    public CustomIconInfo() {
    }

	/** minimal constructor */
    public CustomIconInfo(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public CustomIconInfo(String id, String teamId, String userId, String iconPath, Integer width, Integer height, Timestamp createTime) {
        this.id = id;
        this.teamId = teamId;
        this.userId = userId;
        this.iconPath = iconPath;
        this.width = width;
        this.height = height;
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
    
    @Column(name="ICON_PATH", length=200)

    public String getIconPath() {
        return this.iconPath;
    }
    
    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
    
    @Column(name="WIDTH")

    public Integer getWidth() {
        return this.width;
    }
    
    public void setWidth(Integer width) {
        this.width = width;
    }
    
    @Column(name="HEIGHT")

    public Integer getHeight() {
        return this.height;
    }
    
    public void setHeight(Integer height) {
        this.height = height;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
   








}