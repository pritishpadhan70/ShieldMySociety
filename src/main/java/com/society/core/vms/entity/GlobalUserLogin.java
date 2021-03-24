package com.society.core.vms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the GLOBAL_USER database table.
 * 
 */
@Entity
@Table(name="GLOBAL_USER")
@NamedQuery(name="GlobalUserLogin.findAll", query="SELECT g FROM GlobalUserLogin g")
public class GlobalUserLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private Long userId;

	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="WRONG_PASSWORD_COUNT")
	private  int wrongPassCount;
	
	@Column(name="FORCE_CHANGE_PASSWORD")
	private boolean isForceChangePassword;
	
	@Column(name="IS_ENABLED")
	private boolean isEnabled;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	public GlobalUserLogin() {
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the wrongPassCount
	 */
	public int getWrongPassCount() {
		return wrongPassCount;
	}

	/**
	 * @param wrongPassCount the wrongPassCount to set
	 */
	public void setWrongPassCount(int wrongPassCount) {
		this.wrongPassCount = wrongPassCount;
	}

	/**
	 * @return the isForceChangePassword
	 */
	public boolean isForceChangePassword() {
		return isForceChangePassword;
	}

	/**
	 * @param isForceChangePassword the isForceChangePassword to set
	 */
	public void setForceChangePassword(boolean isForceChangePassword) {
		this.isForceChangePassword = isForceChangePassword;
	}

	/**
	 * @return the isEnabled
	 */
	public boolean isEnabled() {
		return isEnabled;
	}

	/**
	 * @param isEnabled the isEnabled to set
	 */
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	

}