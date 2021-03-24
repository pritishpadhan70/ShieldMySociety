/**
 * 
 */
package com.society.core.vms.dto;

import java.io.Serializable;

/**
 * Class holds data for change password
 * @author Simit.d
 *
 */
public class ChangePassword implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -701631720473454602L;
	
	private Long userId;
	private String oldPassword;
	private String newPassword;
	private String confNewPassword;
	private boolean url;
	

	
	
	/**
	 * 
	 */
	public ChangePassword() {
		super();
	}
	
	
	/**
	 * @param userId
	 * @param oldPassword
	 * @param newPassword
	 * @param confNewPassword
	 * @param url
	 */
	public ChangePassword(Long userId, String oldPassword, String newPassword, String confNewPassword, boolean url) {
		super();
		this.userId = userId;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.confNewPassword = confNewPassword;
		this.url = url;
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
	 * @return the oldPassword
	 */
	public String getOldPassword() {
		return oldPassword;
	}
	/**
	 * @param oldPassword the oldPassword to set
	 */
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	/**
	 * @return the newPassword
	 */
	public String getNewPassword() {
		return newPassword;
	}
	/**
	 * @param newPassword the newPassword to set
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	/**
	 * @return the confNewPassword
	 */
	public String getConfNewPassword() {
		return confNewPassword;
	}
	/**
	 * @param confNewPassword the confNewPassword to set
	 */
	public void setConfNewPassword(String confNewPassword) {
		this.confNewPassword = confNewPassword;
	}
	/**
	 * @return the url
	 */
	public boolean isUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(boolean url) {
		this.url = url;
	}
	

}
