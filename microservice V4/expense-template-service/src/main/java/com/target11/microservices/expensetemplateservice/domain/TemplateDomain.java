package com.target11.microservices.expensetemplateservice.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "T_TEMP_TB")
public class TemplateDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1226363696503863089L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "T_TEMP_Id")
	private String templateId;

	@Column(name = "T_TEMP_LEVEL")
	private String templateLabel;

	@Column(name = "T_EXP_LEVEL")
	private String expenseLabel;

	@Column(name = "T_EXP_AMT")
	private double amount;

	@Column(name = "T_CAT_ID")
	private String categoryId;

	@Column(name = "T_TAG_ID")
	private String tagId;

	@Column(name = "T_EXP_PROFF")
	private String imgaeUrl;

	@Column(name = "T_EXP_PMT_MOD")
	private String paymentMode;

	@Column(name = "T_EXP_DESC")
	private String description;

	@Column(name = "G_ADD_AUD_ID")
	private String addedAuditUserId;

	@Column(name = "G_AUD_ID")
	private String auditUserId;

	@Column(name = "G_ADD_AUD_TS")
	private Date addedAuditTimeStamp;

	@Column(name = "G_AUD_TS")
	private Date auditUserTimeStamp;

	@Version
	private int version;

	/**
	 * @return the templateId
	 */
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * @param templateId the templateId to set
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	/**
	 * @return the templateLabel
	 */
	public String getTemplateLabel() {
		return templateLabel;
	}

	/**
	 * @param templateLabel the templateLabel to set
	 */
	public void setTemplateLabel(String templateLabel) {
		this.templateLabel = templateLabel;
	}

	/**
	 * @return the expenseLabel
	 */
	public String getExpenseLabel() {
		return expenseLabel;
	}

	/**
	 * @param expenseLabel the expenseLabel to set
	 */
	public void setExpenseLabel(String expenseLabel) {
		this.expenseLabel = expenseLabel;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the imgaeUrl
	 */
	public String getImgaeUrl() {
		return imgaeUrl;
	}

	/**
	 * @param imgaeUrl the imgaeUrl to set
	 */
	public void setImgaeUrl(String imgaeUrl) {
		this.imgaeUrl = imgaeUrl;
	}

	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the addedAuditUserId
	 */
	public String getAddedAuditUserId() {
		return addedAuditUserId;
	}

	/**
	 * @param addedAuditUserId the addedAuditUserId to set
	 */
	public void setAddedAuditUserId(String addedAuditUserId) {
		this.addedAuditUserId = addedAuditUserId;
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
	 * @return the addedAuditTimeStamp
	 */
	public Date getAddedAuditTimeStamp() {
		return addedAuditTimeStamp;
	}

	/**
	 * @param addedAuditTimeStamp the addedAuditTimeStamp to set
	 */
	public void setAddedAuditTimeStamp(Date addedAuditTimeStamp) {
		this.addedAuditTimeStamp = addedAuditTimeStamp;
	}

	/**
	 * @return the auditUserTimeStamp
	 */
	public Date getAuditUserTimeStamp() {
		return auditUserTimeStamp;
	}

	/**
	 * @param auditUserTimeStamp the auditUserTimeStamp to set
	 */
	public void setAuditUserTimeStamp(Date auditUserTimeStamp) {
		this.auditUserTimeStamp = auditUserTimeStamp;
	}

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

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
