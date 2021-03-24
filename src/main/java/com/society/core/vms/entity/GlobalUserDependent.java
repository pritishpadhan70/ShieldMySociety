package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the GLOBAL_USER_DEPENDENT database table.
 * 
 */
@Entity
@Table(name="GLOBAL_USER_DEPENDENT")
@NamedQuery(name="GlobalUserDependent.findAll", query="SELECT g FROM GlobalUserDependent g")
public class GlobalUserDependent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GUD_ID")
	private String gudId;

	private int age;

	@Column(name="CREATED_BY")
	private int createdBy;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="GLOBAL_USER_ID")
	private BigInteger globalUserId;

	@Column(name="ID_CARD_TYPE")
	private int idCardType;

	@Column(name="ID_VALUE")
	private String idValue;

	@Column(name="LAST_NAME")
	private String lastName;

	private String phone;

	private String sex;

	public GlobalUserDependent() {
	}

	public String getGudId() {
		return this.gudId;
	}

	public void setGudId(String gudId) {
		this.gudId = gudId;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public BigInteger getGlobalUserId() {
		return this.globalUserId;
	}

	public void setGlobalUserId(BigInteger globalUserId) {
		this.globalUserId = globalUserId;
	}

	public int getIdCardType() {
		return this.idCardType;
	}

	public void setIdCardType(int idCardType) {
		this.idCardType = idCardType;
	}

	public String getIdValue() {
		return this.idValue;
	}

	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}