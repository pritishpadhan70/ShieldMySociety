package com.society.core.vms.dto;

import java.io.Serializable;

public class NotificationActionButtonDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 61731357688650207L;

	private int abId;

	private String buttonDesc;

	private String buttonName;

	/**
	 * 
	 */
	public NotificationActionButtonDTO() {
		super();
	}

	/**
	 * @param abId
	 * @param buttonDesc
	 * @param buttonName
	 */
	public NotificationActionButtonDTO(int abId, String buttonDesc, String buttonName) {
		super();
		this.abId = abId;
		this.buttonDesc = buttonDesc;
		this.buttonName = buttonName;
	}

	/**
	 * @return the abId
	 */
	public int getAbId() {
		return abId;
	}

	/**
	 * @param abId the abId to set
	 */
	public void setAbId(int abId) {
		this.abId = abId;
	}

	/**
	 * @return the buttonDesc
	 */
	public String getButtonDesc() {
		return buttonDesc;
	}

	/**
	 * @param buttonDesc the buttonDesc to set
	 */
	public void setButtonDesc(String buttonDesc) {
		this.buttonDesc = buttonDesc;
	}

	/**
	 * @return the buttonName
	 */
	public String getButtonName() {
		return buttonName;
	}

	/**
	 * @param buttonName the buttonName to set
	 */
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	
	
}
