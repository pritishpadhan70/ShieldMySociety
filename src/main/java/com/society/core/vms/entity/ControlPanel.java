package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CONTROL_PANEL database table.
 * 
 */
@Entity
@Table(name="CONTROL_PANEL")
@NamedQuery(name="ControlPanel.findAll", query="SELECT c FROM ControlPanel c")
public class ControlPanel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CP_ID")
	private int cpId;

	@Column(name="ADMIN_UPDATE_ALERT")
	private int adminUpdateAlert;

	@Column(name="DELETE_USER_TIMEOUT")
	private int deleteUserTimeout;

	@Column(name="DELETE_VISITOR_TIMEOUT")
	private int deleteVisitorTimeout;

	@Column(name="DISABLE_USER_TIMEOUT")
	private int disableUserTimeout;

	@Column(name="IS_EMAIL_OTP")
	private boolean isEmailOtp;

	@Column(name="IS_PHONE_OTP")
	private boolean isPhoneOtp;

	@Column(name="OTP_TIMEOUT")
	private int otpTimeout;

	@Column(name="SOCIETY_NAME_CHANGE_ALERT")
	private boolean societyNameChangeAlert;

	@Column(name="USER_UPDATE_ALERT")
	private int userUpdateAlert;

	public ControlPanel() {
	}

	public int getCpId() {
		return this.cpId;
	}

	public void setCpId(int cpId) {
		this.cpId = cpId;
	}

	public int getAdminUpdateAlert() {
		return this.adminUpdateAlert;
	}

	public void setAdminUpdateAlert(int adminUpdateAlert) {
		this.adminUpdateAlert = adminUpdateAlert;
	}

	public int getDeleteUserTimeout() {
		return this.deleteUserTimeout;
	}

	public void setDeleteUserTimeout(int deleteUserTimeout) {
		this.deleteUserTimeout = deleteUserTimeout;
	}

	public int getDeleteVisitorTimeout() {
		return this.deleteVisitorTimeout;
	}

	public void setDeleteVisitorTimeout(int deleteVisitorTimeout) {
		this.deleteVisitorTimeout = deleteVisitorTimeout;
	}

	public int getDisableUserTimeout() {
		return this.disableUserTimeout;
	}

	public void setDisableUserTimeout(int disableUserTimeout) {
		this.disableUserTimeout = disableUserTimeout;
	}

	public boolean getIsEmailOtp() {
		return this.isEmailOtp;
	}

	public void setIsEmailOtp(boolean isEmailOtp) {
		this.isEmailOtp = isEmailOtp;
	}

	public boolean getIsPhoneOtp() {
		return this.isPhoneOtp;
	}

	public void setIsPhoneOtp(boolean isPhoneOtp) {
		this.isPhoneOtp = isPhoneOtp;
	}

	public int getOtpTimeout() {
		return this.otpTimeout;
	}

	public void setOtpTimeout(int otpTimeout) {
		this.otpTimeout = otpTimeout;
	}

	public boolean getSocietyNameChangeAlert() {
		return this.societyNameChangeAlert;
	}

	public void setSocietyNameChangeAlert(boolean societyNameChangeAlert) {
		this.societyNameChangeAlert = societyNameChangeAlert;
	}

	public int getUserUpdateAlert() {
		return this.userUpdateAlert;
	}

	public void setUserUpdateAlert(int userUpdateAlert) {
		this.userUpdateAlert = userUpdateAlert;
	}

}