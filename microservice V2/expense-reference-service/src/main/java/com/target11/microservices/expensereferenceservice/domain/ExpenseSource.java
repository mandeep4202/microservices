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
@Table(name = "R_EXP_SRC_TB")
public class ExpenseSource {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "source_id")
	private int sourceId;
	
	@Column(name = "source_desc")
	private String sourceDesc;
	
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
	 * @return the sourceId
	 */
	public int getSourceId() {
		return sourceId;
	}

	/**
	 * @param sourceId the sourceId to set
	 */
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * @return the sourceDesc
	 */
	public String getSourceDesc() {
		return sourceDesc;
	}

	/**
	 * @param sourceDesc the sourceDesc to set
	 */
	public void setSourceDesc(String sourceDesc) {
		this.sourceDesc = sourceDesc;
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
