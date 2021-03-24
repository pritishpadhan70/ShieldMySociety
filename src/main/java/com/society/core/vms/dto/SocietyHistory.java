package com.society.core.vms.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The DTO class for the SOCIETY_HISTORY data.
 * 
 */
public class SocietyHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	private int comment;
	private BigInteger modifiedBy;
	private String newValue;
	private String oldValue;
	private String operation;
	private BigInteger shId;
	private BigInteger societyId;
	private Timestamp time;

	public SocietyHistory() {
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

	public BigInteger getShId() {
		return this.shId;
	}

	public void setShId(BigInteger shId) {
		this.shId = shId;
	}

	public BigInteger getSocietyId() {
		return this.societyId;
	}

	public void setSocietyId(BigInteger societyId) {
		this.societyId = societyId;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}