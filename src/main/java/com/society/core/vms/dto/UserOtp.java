package com.society.core.vms.dto;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The DTO class for the USER_OTP data.
 * 
 */
public class UserOtp implements Serializable {
	private static final long serialVersionUID = 1L;

	private int createdBy;
	private Timestamp createdTime;
	private String email;
	private boolean isActive;
	private String needFor;
	private int otpId;
	private int otpValue;
	private String phone;

	public UserOtp() {
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getNeedFor() {
		return this.needFor;
	}

	public void setNeedFor(String needFor) {
		this.needFor = needFor;
	}

	public int getOtpId() {
		return this.otpId;
	}

	public void setOtpId(int otpId) {
		this.otpId = otpId;
	}

	public int getOtpValue() {
		return this.otpValue;
	}

	public void setOtpValue(int otpValue) {
		this.otpValue = otpValue;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}