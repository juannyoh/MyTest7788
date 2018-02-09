package entity;
// default package

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * AreaPointPhotosEntityId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class AreaPointPhotosEntityId  implements java.io.Serializable {


    // Fields    

     private String id;
     private String teamId;
     private String layerId;
     private String layerCode;
     private String dataId;
     private Short dataType;
     private String photoPath;


    // Constructors

    /** default constructor */
    public AreaPointPhotosEntityId() {
    }

    
    /** full constructor */
    public AreaPointPhotosEntityId(String id, String teamId, String layerId, String layerCode, String dataId, Short dataType, String photoPath) {
        this.id = id;
        this.teamId = teamId;
        this.layerId = layerId;
        this.layerCode = layerCode;
        this.dataId = dataId;
        this.dataType = dataType;
        this.photoPath = photoPath;
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

    @Column(name="DATA_ID", length=32)

    public String getDataId() {
        return this.dataId;
    }
    
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    @Column(name="DATA_TYPE")

    public Short getDataType() {
        return this.dataType;
    }
    
    public void setDataType(Short dataType) {
        this.dataType = dataType;
    }

    @Column(name="PHOTO_PATH", length=100)

    public String getPhotoPath() {
        return this.photoPath;
    }
    
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AreaPointPhotosEntityId) ) return false;
		 AreaPointPhotosEntityId castOther = ( AreaPointPhotosEntityId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getTeamId()==castOther.getTeamId()) || ( this.getTeamId()!=null && castOther.getTeamId()!=null && this.getTeamId().equals(castOther.getTeamId()) ) )
 && ( (this.getLayerId()==castOther.getLayerId()) || ( this.getLayerId()!=null && castOther.getLayerId()!=null && this.getLayerId().equals(castOther.getLayerId()) ) )
 && ( (this.getLayerCode()==castOther.getLayerCode()) || ( this.getLayerCode()!=null && castOther.getLayerCode()!=null && this.getLayerCode().equals(castOther.getLayerCode()) ) )
 && ( (this.getDataId()==castOther.getDataId()) || ( this.getDataId()!=null && castOther.getDataId()!=null && this.getDataId().equals(castOther.getDataId()) ) )
 && ( (this.getDataType()==castOther.getDataType()) || ( this.getDataType()!=null && castOther.getDataType()!=null && this.getDataType().equals(castOther.getDataType()) ) )
 && ( (this.getPhotoPath()==castOther.getPhotoPath()) || ( this.getPhotoPath()!=null && castOther.getPhotoPath()!=null && this.getPhotoPath().equals(castOther.getPhotoPath()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getTeamId() == null ? 0 : this.getTeamId().hashCode() );
         result = 37 * result + ( getLayerId() == null ? 0 : this.getLayerId().hashCode() );
         result = 37 * result + ( getLayerCode() == null ? 0 : this.getLayerCode().hashCode() );
         result = 37 * result + ( getDataId() == null ? 0 : this.getDataId().hashCode() );
         result = 37 * result + ( getDataType() == null ? 0 : this.getDataType().hashCode() );
         result = 37 * result + ( getPhotoPath() == null ? 0 : this.getPhotoPath().hashCode() );
         return result;
   }   





}