package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The DTO class for the ID_CARD_TYPE data.
 * 
 */
public class IdCardType implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ictId;
	private String approvedBy;
	private String comments;
	private String ictName;

	public IdCardType() {
	}

	public String getIctId() {
		return this.ictId;
	}

	public void setIctId(String ictId) {
		this.ictId = ictId;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getIctName() {
		return this.ictName;
	}

	public void setIctName(String ictName) {
		this.ictName = ictName;
	}

}