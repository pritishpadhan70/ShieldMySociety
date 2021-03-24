package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;


/**
 * The persistent class for the USER_OTP database table.
 * 
 */
@Entity
@Table(name="USER_OTP")
@NamedQuery(name="UserOtp.findAll", query="SELECT u FROM UserOtp u")
public class UserOtp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	@Column(name="OTP_ID")
	private Long otpId;

	@Column(name="CREATED_BY")
	private Long createdBy;

	@Column(name="CREATED_TIME")
	private Timestamp createdTime;

	private String email;

	@Column(name="IS_ACTIVE")
	private boolean isActive;

	@Column(name="NEED_FOR")
	private String needFor;

	@Column(name="OTP_VALUE")
	private int otpValue;

	@Column(name="IS_VERIFIED")
	private boolean isVerified;
	
	private String phone;
	
	public UserOtp() {
	}
	
	
	/**
	 * @param createdBy
	 * @param createdTime
	 * @param email
	 * @param isActive
	 * @param needFor
	 * @param otpValue
	 * @param phone
	 */
	public UserOtp(Long createdBy, Timestamp createdTime, String email, boolean isActive, String needFor, int otpValue,
			String phone) {
		super();
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.email = email;
		this.isActive = isActive;
		this.needFor = needFor;
		this.otpValue = otpValue;
		this.phone = phone;
	}
	
	
	/**
	 * @return the isVerified
	 */
	public boolean isVerified() {
		return isVerified;
	}


	/**
	 * @param isVerified the isVerified to set
	 */
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}


	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Long getOtpId() {
		return this.otpId;
	}

	public void setOtpId(Long otpId) {
		this.otpId = otpId;
	}

	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
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