package com.target11.microservices.expensereferenceservice.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "R_CAT_TB")
public class Category {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "R_CAT_ID")
	private String catrgoryId;
	
	@Column(name = "R_CAT_DESC")
	private String categoryDesc;
	
	@Column(name = "G_ADD_AUD_TS")
	private Date addAuditTimeStamp;
	
	@Column(name = "G_ADD_AUD_USER_ID")
	private String addAudditUserId;
	
	@Column(name = "G_AUD_TS")
	private Date auditTimeStamp;
	
	@Column(name = "G_AUD_USER_ID")
	private String auditUserId;
	
	@Version
    private int version;
	
	
	
	
	/**
	 * @return the catrgoryId
	 */
	public String getCatrgoryId() {
		return catrgoryId;
	}
	/**
	 * @param catrgoryId the catrgoryId to set
	 */
	public void setCatrgoryId(String catrgoryId) {
		this.catrgoryId = catrgoryId;
	}
	/**
	 * @return the categoryDesc
	 */
	public String getCategoryDesc() {
		return categoryDesc;
	}
	/**
	 * @param categoryDesc the categoryDesc to set
	 */
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	/**
	 * @return the addAuditTimeStamp
	 */
	public Date getAddAuditTimeStamp() {
		return addAuditTimeStamp;
	}
	/**
	 * @param addAuditTimeStamp the addAuditTimeStamp to set
	 */
	public void setAddAuditTimeStamp(Date addAuditTimeStamp) {
		this.addAuditTimeStamp = addAuditTimeStamp;
	}
	/**
	 * @return the auditTimeStamp
	 */
	public Date getAuditTimeStamp() {
		return auditTimeStamp;
	}
	/**
	 * @param auditTimeStamp the auditTimeStamp to set
	 */
	public void setAuditTimeStamp(Date auditTimeStamp) {
		this.auditTimeStamp = auditTimeStamp;
	}
	/**
	 * @return the addAudditUserId
	 */
	public String getAddAudditUserId() {
		return addAudditUserId;
	}
	/**
	 * @param addAudditUserId the addAudditUserId to set
	 */
	public void setAddAudditUserId(String addAudditUserId) {
		this.addAudditUserId = addAudditUserId;
	}
	/**
	 * @return the auditUserId
	 */
	public String getAuditUserId() {
		return auditUserId;
	}
	/**
	 * @param auditUserId the auditUserId to set
	 */
	public void setAuditUserId(String auditUserId) {
		this.auditUserId = auditUserId;
	}
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	
}
