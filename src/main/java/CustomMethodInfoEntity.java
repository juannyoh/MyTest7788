// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * CustomMethodInfoEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="custom_method_info"
    ,catalog="saas_base"
)

public class CustomMethodInfoEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String methodName;
     private String methodDesc;
     private Short methodStatus;
     private Timestamp createTime;
     private String createUserid;


    // Constructors

    /** default constructor */
    public CustomMethodInfoEntity() {
    }

	/** minimal constructor */
    public CustomMethodInfoEntity(String id, String methodName, String methodDesc) {
        this.id = id;
        this.methodName = methodName;
        this.methodDesc = methodDesc;
    }
    
    /** full constructor */
    public CustomMethodInfoEntity(String id, String methodName, String methodDesc, Short methodStatus, Timestamp createTime, String createUserid) {
        this.id = id;
        this.methodName = methodName;
        this.methodDesc = methodDesc;
        this.methodStatus = methodStatus;
        this.createTime = createTime;
        this.createUserid = createUserid;
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
    
    @Column(name="METHOD_NAME", nullable=false, length=100)

    public String getMethodName() {
        return this.methodName;
    }
    
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
    
    @Column(name="METHOD_DESC", nullable=false, length=32)

    public String getMethodDesc() {
        return this.methodDesc;
    }
    
    public void setMethodDesc(String methodDesc) {
        this.methodDesc = methodDesc;
    }
    
    @Column(name="METHOD_STATUS")

    public Short getMethodStatus() {
        return this.methodStatus;
    }
    
    public void setMethodStatus(Short methodStatus) {
        this.methodStatus = methodStatus;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="CREATE_USERID", length=100)

    public String getCreateUserid() {
        return this.createUserid;
    }
    
    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }
   








}