package com.society.core.vms.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The DTO class for the STAFF_HISTORY data.
 * 
 */
public class StaffHistory implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int comment;
	private BigInteger modifiedBy;
	private String newValue;
	private String oldValue;
	private String operation;
	private BigInteger staffHistoryId;
	private BigInteger staffId;
	private Timestamp time;

	public StaffHistory() {
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

	public BigInteger getStaffHistoryId() {
		return this.staffHistoryId;
	}

	public void setStaffHistoryId(BigInteger staffHistoryId) {
		this.staffHistoryId = staffHistoryId;
	}

	public BigInteger getStaffId() {
		return this.staffId;
	}

	public void setStaffId(BigInteger staffId) {
		this.staffId = staffId;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}