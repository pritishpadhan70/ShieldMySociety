package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the USER_HISTORY database table.
 * 
 */
@Entity
@Table(name="USER_HISTORY")
@NamedQuery(name="UserHistory.findAll", query="SELECT u FROM UserHistory u")
public class UserHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UH_ID")
	private String uhId;

	@Column(name="`COMMENT`")
	private int comment;

	@Column(name="MODIFIED_BY")
	private BigInteger modifiedBy;

	@Column(name="NEW_VALUE")
	private String newValue;

	@Column(name="OLD_VALUE")
	private String oldValue;

	private String operation;

	private Timestamp time;

	@Column(name="USER_ID")
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