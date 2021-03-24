package com.society.core.vms.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The DTO class for the GLOBAL_USER_DEPENDENT data.
 * 
 */
public class GlobalUserDependentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String gudId;
	private int age;
	private int createdBy;
	private Timestamp createdDate;
	private String firstName;
	private BigInteger globalUserId;
	private int idCardType;
	private String idValue;
	private String lastName;
	private String phone;
	private String sex;

	public GlobalUserDependentDTO() {
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