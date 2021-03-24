package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The DTO class for the CONTROL_PANEL data.
 * 
 */

public class ControlPanel implements Serializable {
	private static final long serialVersionUID = 1L;


	private int cpId;

	private int adminUpdateAlert;

	private int deleteUserTimeout;
	private int deleteVisitorTimeout;
	private int disableUserTimeout;
	private boolean isEmailOtp;
	private boolean isPhoneOtp;
	private int otpTimeout;
	private boolean societyNameChangeAlert;
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