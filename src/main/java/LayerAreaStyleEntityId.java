// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * LayerAreaStyleEntityId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class LayerAreaStyleEntityId  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
     private String teamId;
     private String layerId;
     private String layerCode;
     private String areaId;
     private String fillTransparency;
     private String fillColor;
     private String lineColor;
     private Integer lineWidth;
     private String lineTransparency;
     private Short styleType;
     private Timestamp createTime;
     private String userId;


    // Constructors

    /** default constructor */
    public LayerAreaStyleEntityId() {
    }

    
    /** full constructor */
    public LayerAreaStyleEntityId(String id, String teamId, String layerId, String layerCode, String areaId, String fillTransparency, String fillColor, String lineColor, Integer lineWidth, String lineTransparency, Short styleType, Timestamp createTime, String userId) {
        this.id = id;
        this.teamId = teamId;
        this.layerId = layerId;
        this.layerCode = layerCode;
        this.areaId = areaId;
        this.fillTransparency = fillTransparency;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
        this.lineWidth = lineWidth;
        this.lineTransparency = lineTransparency;
        this.styleType = styleType;
        this.createTime = createTime;
        this.userId = userId;
    }

   
    // Property accessors

    @Column(name="ID", length=32)

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

    @Column(name="AREA_ID", length=32)

    public String getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    @Column(name="FILL_TRANSPARENCY", length=10)

    public String getFillTransparency() {
        return this.fillTransparency;
    }
    
    public void setFillTransparency(String fillTransparency) {
        this.fillTransparency = fillTransparency;
    }

    @Column(name="FILL_COLOR", length=10)

    public String getFillColor() {
        return this.fillColor;
    }
    
    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Column(name="LINE_COLOR", length=10)

    public String getLineColor() {
        return this.lineColor;
    }
    
    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    @Column(name="LINE_WIDTH")

    public Integer getLineWidth() {
        return this.lineWidth;
    }
    
    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }

    @Column(name="LINE_TRANSPARENCY", length=10)

    public String getLineTransparency() {
        return this.lineTransparency;
    }
    
    public void setLineTransparency(String lineTransparency) {
        this.lineTransparency = lineTransparency;
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
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LayerAreaStyleEntityId) ) return false;
		 LayerAreaStyleEntityId castOther = ( LayerAreaStyleEntityId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getTeamId()==castOther.getTeamId()) || ( this.getTeamId()!=null && castOther.getTeamId()!=null && this.getTeamId().equals(castOther.getTeamId()) ) )
 && ( (this.getLayerId()==castOther.getLayerId()) || ( this.getLayerId()!=null && castOther.getLayerId()!=null && this.getLayerId().equals(castOther.getLayerId()) ) )
 && ( (this.getLayerCode()==castOther.getLayerCode()) || ( this.getLayerCode()!=null && castOther.getLayerCode()!=null && this.getLayerCode().equals(castOther.getLayerCode()) ) )
 && ( (this.getAreaId()==castOther.getAreaId()) || ( this.getAreaId()!=null && castOther.getAreaId()!=null && this.getAreaId().equals(castOther.getAreaId()) ) )
 && ( (this.getFillTransparency()==castOther.getFillTransparency()) || ( this.getFillTransparency()!=null && castOther.getFillTransparency()!=null && this.getFillTransparency().equals(castOther.getFillTransparency()) ) )
 && ( (this.getFillColor()==castOther.getFillColor()) || ( this.getFillColor()!=null && castOther.getFillColor()!=null && this.getFillColor().equals(castOther.getFillColor()) ) )
 && ( (this.getLineColor()==castOther.getLineColor()) || ( this.getLineColor()!=null && castOther.getLineColor()!=null && this.getLineColor().equals(castOther.getLineColor()) ) )
 && ( (this.getLineWidth()==castOther.getLineWidth()) || ( this.getLineWidth()!=null && castOther.getLineWidth()!=null && this.getLineWidth().equals(castOther.getLineWidth()) ) )
 && ( (this.getLineTransparency()==castOther.getLineTransparency()) || ( this.getLineTransparency()!=null && castOther.getLineTransparency()!=null && this.getLineTransparency().equals(castOther.getLineTransparency()) ) )
 && ( (this.getStyleType()==castOther.getStyleType()) || ( this.getStyleType()!=null && castOther.getStyleType()!=null && this.getStyleType().equals(castOther.getStyleType()) ) )
 && ( (this.getCreateTime()==castOther.getCreateTime()) || ( this.getCreateTime()!=null && castOther.getCreateTime()!=null && this.getCreateTime().equals(castOther.getCreateTime()) ) )
 && ( (this.getUserId()==castOther.getUserId()) || ( this.getUserId()!=null && castOther.getUserId()!=null && this.getUserId().equals(castOther.getUserId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getTeamId() == null ? 0 : this.getTeamId().hashCode() );
         result = 37 * result + ( getLayerId() == null ? 0 : this.getLayerId().hashCode() );
         result = 37 * result + ( getLayerCode() == null ? 0 : this.getLayerCode().hashCode() );
         result = 37 * result + ( getAreaId() == null ? 0 : this.getAreaId().hashCode() );
         result = 37 * result + ( getFillTransparency() == null ? 0 : this.getFillTransparency().hashCode() );
         result = 37 * result + ( getFillColor() == null ? 0 : this.getFillColor().hashCode() );
         result = 37 * result + ( getLineColor() == null ? 0 : this.getLineColor().hashCode() );
         result = 37 * result + ( getLineWidth() == null ? 0 : this.getLineWidth().hashCode() );
         result = 37 * result + ( getLineTransparency() == null ? 0 : this.getLineTransparency().hashCode() );
         result = 37 * result + ( getStyleType() == null ? 0 : this.getStyleType().hashCode() );
         result = 37 * result + ( getCreateTime() == null ? 0 : this.getCreateTime().hashCode() );
         result = 37 * result + ( getUserId() == null ? 0 : this.getUserId().hashCode() );
         return result;
   }   





}