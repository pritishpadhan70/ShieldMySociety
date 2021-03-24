package com.society.core.vms.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The DTO class for the USER_HISTORY data.
 * 
 */
public class UserHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	private String uhId;

	private int comment;
	private BigInteger modifiedBy;
	private String newValue;
	private String oldValue;
	private String operation;
	private Timestamp time;
	private BigInteger userId;

	public UserHistory() {
	}

	public String getUhId() {
		return this.uhId;
	}

	public void setUhId(String uhId) {
		this.uhId = uhId;
	}

	public int getComment() {
		return this.comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

	public BigInteger getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(BigInteger modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

}