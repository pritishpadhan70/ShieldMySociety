package com.society.core.vms.request;

import java.io.Serializable;

public class PhoneEmailRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5107926665252834609L;

	private String phone;
	private String email;
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
