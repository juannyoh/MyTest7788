package entity;
// default package

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * AreaPointPhotosEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="area_point_photos"
    ,catalog="saas_biz"
)

public class AreaPointPhotosEntity  implements java.io.Serializable {


    // Fields    

     private AreaPointPhotosEntityId id;


    // Constructors

    /** default constructor */
    public AreaPointPhotosEntity() {
    }

    
    /** full constructor */
    public AreaPointPhotosEntity(AreaPointPhotosEntityId id) {
        this.id = id;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="ID", length=32) ), 
        @AttributeOverride(name="teamId", column=@Column(name="TEAM_ID", length=32) ), 
        @AttributeOverride(name="layerId", column=@Column(name="LAYER_ID", length=32) ), 
        @AttributeOverride(name="layerCode", column=@Column(name="LAYER_CODE", length=100) ), 
        @AttributeOverride(name="dataId", column=@Column(name="DATA_ID", length=32) ), 
        @AttributeOverride(name="dataType", column=@Column(name="DATA_TYPE") ), 
        @AttributeOverride(name="photoPath", column=@Column(name="PHOTO_PATH", length=100) ) } )

    public AreaPointPhotosEntityId getId() {
        return this.id;
    }
    
    public void setId(AreaPointPhotosEntityId id) {
        this.id = id;
    }
   








}