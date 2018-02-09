// default package

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * LayerAreaStyleEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="layer_area_style"
    ,catalog="saas_biz"
)

public class LayerAreaStyleEntity  implements java.io.Serializable {


    // Fields    

     private LayerAreaStyleEntityId id;


    // Constructors

    /** default constructor */
    public LayerAreaStyleEntity() {
    }

    
    /** full constructor */
    public LayerAreaStyleEntity(LayerAreaStyleEntityId id) {
        this.id = id;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="ID", length=32) ), 
        @AttributeOverride(name="teamId", column=@Column(name="TEAM_ID", length=32) ), 
        @AttributeOverride(name="layerId", column=@Column(name="LAYER_ID", length=32) ), 
        @AttributeOverride(name="layerCode", column=@Column(name="LAYER_CODE", length=100) ), 
        @AttributeOverride(name="areaId", column=@Column(name="AREA_ID", length=32) ), 
        @AttributeOverride(name="fillTransparency", column=@Column(name="FILL_TRANSPARENCY", length=10) ), 
        @AttributeOverride(name="fillColor", column=@Column(name="FILL_COLOR", length=10) ), 
        @AttributeOverride(name="lineColor", column=@Column(name="LINE_COLOR", length=10) ), 
        @AttributeOverride(name="lineWidth", column=@Column(name="LINE_WIDTH") ), 
        @AttributeOverride(name="lineTransparency", column=@Column(name="LINE_TRANSPARENCY", length=10) ), 
        @AttributeOverride(name="styleType", column=@Column(name="STYLE_TYPE") ), 
        @AttributeOverride(name="createTime", column=@Column(name="CREATE_TIME", length=19) ), 
        @AttributeOverride(name="userId", column=@Column(name="USER_ID", length=32) ) } )

    public LayerAreaStyleEntityId getId() {
        return this.id;
    }
    
    public void setId(LayerAreaStyleEntityId id) {
        this.id = id;
    }
   








}