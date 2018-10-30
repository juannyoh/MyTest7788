// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * WorkFlowLogEntity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="workflow_log"
    ,catalog="saas_biz"
)

public class WorkFlowLogEntity  implements java.io.Serializable {


    // Fields    

     private String id;
     private String dataId;
     private String stepId;
     private String auditUser;
     private String auditType;
     private String auditOpinion;
     private Timestamp createTime;


    // Constructors

    /** default constructor */
    public WorkFlowLogEntity() {
    }

	/** minimal constructor */
    public WorkFlowLogEntity(String id, String dataId, String stepId) {
        this.id = id;
        this.dataId = dataId;
        this.stepId = stepId;
    }
    
    /** full constructor */
    public WorkFlowLogEntity(String id, String dataId, String stepId, String auditUser, String auditType, String auditOpinion, Timestamp createTime) {
        this.id = id;
        this.dataId = dataId;
        this.stepId = stepId;
        this.auditUser = auditUser;
        this.auditType = auditType;
        this.auditOpinion = auditOpinion;
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
    
    @Column(name="DATA_ID", nullable=false, length=32)

    public String getDataId() {
        return this.dataId;
    }
    
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }
    
    @Column(name="STEP_ID", nullable=false, length=32)

    public String getStepId() {
        return this.stepId;
    }
    
    public void setStepId(String stepId) {
        this.stepId = stepId;
    }
    
    @Column(name="AUDIT_USER", length=32)

    public String getAuditUser() {
        return this.auditUser;
    }
    
    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser;
    }
    
    @Column(name="AUDIT_TYPE", length=20)

    public String getAuditType() {
        return this.auditType;
    }
    
    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }
    
    @Column(name="AUDIT_OPINION", length=200)

    public String getAuditOpinion() {
        return this.auditOpinion;
    }
    
    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }
    
    @Column(name="CREATE_TIME", length=19)

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
   








}