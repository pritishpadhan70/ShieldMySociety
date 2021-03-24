package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the USER_ID_VALUE_DETAILS database table.
 * 
 */
@Entity
@Table(name="USER_ID_VALUE_DETAILS")
@NamedQuery(name="UserIdValueDetail.findAll", query="SELECT u FROM UserIdValueDetail u")
public class UserIdValueDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UIVD_ID")
	private String uivdId;

	@Column(name="ID_NO_VALUE")
	private int idNoValue;

	@Column(name="ID_TYPE")
	private int idType;

	@Column(name="USER_ID")
	private BigInteger userId;

	public UserIdValueDetail() {
	}

	public String getUivdId() {
		return this.uivdId;
	}

	public void setUivdId(String uivdId) {
		this.uivdId = uivdId;
	}

	public int getIdNoValue() {
		return this.idNoValue;
	}

	public void setIdNoValue(int idNoValue) {
		this.idNoValue = idNoValue;
	}

	public int getIdType() {
		return this.idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

}