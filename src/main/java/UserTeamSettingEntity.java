// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * UserTeamSettingEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user_team_setting"
    ,catalog="saas_biz"
)

public class UserTeamSettingEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String userId;
     private String settingField;
     private String settingValue;
     private Timestamp createTime;
     private Timestamp updateTime;


    // Constructors

    /** default constructor */
    public UserTeamSettingEntity() {
    }

	/** minimal constructor */
    public UserTeamSettingEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public UserTeamSettingEntity(String id, String teamId, String userId, String settingField, String settingValue, Timestamp createTime, Timestamp updateTime) {
        this.id = id;
        this.teamId = teamId;
        this.userId = userId;
        this.settingField = settingField;
        this.settingValue = settingValue;
        this.createTime = createTime;
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
    
    @Column(name="SETTING_FIELD", length=20)

    public String getSettingField() {
        return this.settingField;
    }
    
    public void setSettingField(String settingField) {
        this.settingField = settingField;
    }
    
    @Column(name="SETTING_VALUE", length=50)

    public String getSettingValue() {
        return this.settingValue;
    }
    
    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="UPDATE_TIME", length=19)

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }
    
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
   








}