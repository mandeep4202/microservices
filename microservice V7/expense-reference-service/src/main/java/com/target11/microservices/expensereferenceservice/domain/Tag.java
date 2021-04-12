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
@Table(name = "R_TAG_TB")
public class Tag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tag_id")
	private String tagId;

	@Column(name = "tag_desc")
	private String tagDesc;

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
	 * @return the tagId
	 */
	public String getTagId() {
		return tagId;
	}

	/**
	 * @param tagId the tagId to set
	 */
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	/**
	 * @return the tagDesc
	 */
	public String getTagDesc() {
		return tagDesc;
	}

	/**
	 * @param tagDesc the tagDesc to set
	 */
	public void setTagDesc(String tagDesc) {
		this.tagDesc = tagDesc;
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
