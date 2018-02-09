// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * LayerPointStyleEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="layer_point_style"
    ,catalog="saas_biz"
)

public class LayerPointStyleEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String layerId;
     private String layerCode;
     private String dataId;
     private Short styleType;
     private String appShape;
     private String appSize;
     private String appColor;
     private String appDesign;
     private Timestamp createTime;
     private String userId;


    // Constructors

    /** default constructor */
    public LayerPointStyleEntity() {
    }

	/** minimal constructor */
    public LayerPointStyleEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public LayerPointStyleEntity(String id, String teamId, String layerId, String layerCode, String dataId, Short styleType, String appShape, String appSize, String appColor, String appDesign, Timestamp createTime, String userId) {
        this.id = id;
        this.teamId = teamId;
        this.layerId = layerId;
        this.layerCode = layerCode;
        this.dataId = dataId;
        this.styleType = styleType;
        this.appShape = appShape;
        this.appSize = appSize;
        this.appColor = appColor;
        this.appDesign = appDesign;
        this.createTime = createTime;
        this.userId = userId;
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
    
    @Column(name="LAYER_ID", length=32)

    public String getLayerId() {
        return this.layerId;
    }
    
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }
    
    @Column(name="LAYER_CODE", length=100)

    public String getLayerCode() {
        return this.layerCode;
    }
    
    public void setLayerCode(String layerCode) {
        this.layerCode = layerCode;
    }
    
    @Column(name="DATA_ID", length=32)

    public String getDataId() {
        return this.dataId;
    }
    
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }
    
    @Column(name="STYLE_TYPE")

    public Short getStyleType() {
        return this.styleType;
    }
    
    public void setStyleType(Short styleType) {
        this.styleType = styleType;
    }
    
    @Column(name="APP_SHAPE", length=20)

    public String getAppShape() {
        return this.appShape;
    }
    
    public void setAppShape(String appShape) {
        this.appShape = appShape;
    }
    
    @Column(name="APP_SIZE", length=20)

    public String getAppSize() {
        return this.appSize;
    }
    
    public void setAppSize(String appSize) {
        this.appSize = appSize;
    }
    
    @Column(name="APP_COLOR", length=20)

    public String getAppColor() {
        return this.appColor;
    }
    
    public void setAppColor(String appColor) {
        this.appColor = appColor;
    }
    
    @Column(name="APP_DESIGN", length=20)

    public String getAppDesign() {
        return this.appDesign;
    }
    
    public void setAppDesign(String appDesign) {
        this.appDesign = appDesign;
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
   








}