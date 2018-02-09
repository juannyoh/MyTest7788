// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * LayerLineStyleEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="layer_line_style"
    ,catalog="saas_biz"
)

public class LayerLineStyleEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String layerId;
     private String layerCode;
     private String dataId;
     private String lineColor;
     private String lineTransparency;
     private Integer lineWidth;
     private String lineShape;
     private Short styleType;
     private Timestamp createTime;
     private String userId;


    // Constructors

    /** default constructor */
    public LayerLineStyleEntity() {
    }

	/** minimal constructor */
    public LayerLineStyleEntity(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public LayerLineStyleEntity(String id, String teamId, String layerId, String layerCode, String dataId, String lineColor, String lineTransparency, Integer lineWidth, String lineShape, Short styleType, Timestamp createTime, String userId) {
        this.id = id;
        this.teamId = teamId;
        this.layerId = layerId;
        this.layerCode = layerCode;
        this.dataId = dataId;
        this.lineColor = lineColor;
        this.lineTransparency = lineTransparency;
        this.lineWidth = lineWidth;
        this.lineShape = lineShape;
        this.styleType = styleType;
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
    
    @Column(name="LINE_COLOR", length=10)

    public String getLineColor() {
        return this.lineColor;
    }
    
    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }
    
    @Column(name="LINE_TRANSPARENCY", length=10)

    public String getLineTransparency() {
        return this.lineTransparency;
    }
    
    public void setLineTransparency(String lineTransparency) {
        this.lineTransparency = lineTransparency;
    }
    
    @Column(name="LINE_WIDTH")

    public Integer getLineWidth() {
        return this.lineWidth;
    }
    
    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }
    
    @Column(name="LINE_SHAPE", length=10)

    public String getLineShape() {
        return this.lineShape;
    }
    
    public void setLineShape(String lineShape) {
        this.lineShape = lineShape;
    }
    
    @Column(name="STYLE_TYPE")

    public Short getStyleType() {
        return this.styleType;
    }
    
    public void setStyleType(Short styleType) {
        this.styleType = styleType;
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