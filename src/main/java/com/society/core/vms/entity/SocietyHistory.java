package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the SOCIETY_HISTORY database table.
 * 
 */
@Entity
@Table(name="SOCIETY_HISTORY")
@NamedQuery(name="SocietyHistory.findAll", query="SELECT s FROM SocietyHistory s")
public class SocietyHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SH_ID")
	private String shId;

	@Column(name="`COMMENT`")
	private int comment;

	@Column(name="MODIFIED_BY")
	private BigInteger modifiedBy;

	@Column(name="NEW_VALUE")
	private String newValue;

	@Column(name="OLD_VALUE")
	private String oldValue;

	private String operation;

	@Column(name="SOCIETY_ID")
	private BigInteger societyId;

	private Timestamp time;

	public SocietyHistory() {
	}

	public String getShId() {
		return this.shId;
	}

	public void setShId(String shId) {
		this.shId = shId;
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