package com.target11.microservices.expensetemplateservice.vo;

import java.util.Date;

import javax.persistence.Column;

public class TemplateVO {

	private int templateId;
	private String templateLabel;
	private String expenseLabel;
	private double amount;
	private String categoryId;
	private String categoryDesc;
	private String tagId;
	private String tagDesc;
	private String imgaeUrl;
	private String paymentMode;
	private String description;
	private String addedAuditUserId;
	private String auditUserId;
	private Date addedAuditTimeStamp;
	private Date auditUserTimeStamp;

	/**
	 * @return the templateId
	 */
	public int getTemplateId() {
		return templateId;
	}

	/**
	 * @param templateId the templateId to set
	 */
	public void setTemplateId(int templateId) {
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

	
	
}
