package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the STAFF_HISTORY database table.
 * 
 */
@Entity
@Table(name="STAFF_HISTORY")
@NamedQuery(name="StaffHistory.findAll", query="SELECT s FROM StaffHistory s")
public class StaffHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STAFF_HISTORY_ID")
	private String staffHistoryId;

	@Column(name="`COMMENT`")
	private int comment;

	@Column(name="MODIFIED_BY")
	private BigInteger modifiedBy;

	@Column(name="NEW_VALUE")
	private String newValue;

	@Column(name="OLD_VALUE")
	private String oldValue;

	private String operation;

	@Column(name="STAFF_ID")
	private BigInteger staffId;

	private Timestamp time;

	public StaffHistory() {
	}

	public String getStaffHistoryId() {
		return this.staffHistoryId;
	}

	public void setStaffHistoryId(String staffHistoryId) {
		this.staffHistoryId = staffHistoryId;
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