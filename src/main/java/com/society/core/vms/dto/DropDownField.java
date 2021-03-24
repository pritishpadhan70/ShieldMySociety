package com.society.core.vms.dto;

import java.io.Serializable;

public class DropDownField implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2665242974472095494L;
	private Integer dropdownId;
	private String dropdownName;
	/**
	 * 
	 */
	public DropDownField() {
		super();
	}
	/**
	 * @param dropdownId
	 * @param dropdownName
	 */
	public DropDownField(Integer dropdownId, String dropdownName) {
		super();
		this.dropdownId = dropdownId;
		this.dropdownName = dropdownName;
	}
	/**
	 * @return the dropdownId
	 */
	public Integer getDropdownId() {
		return dropdownId;
	}
	/**
	 * @param dropdownId the dropdownId to set
	 */
	public void setDropdownId(Integer dropdownId) {
		this.dropdownId = dropdownId;
	}
	/**
	 * @return the dropdownName
	 */
	public String getDropdownName() {
		return dropdownName;
	}
	/**
	 * @param dropdownName the dropdownName to set
	 */
	public void setDropdownName(String dropdownName) {
		this.dropdownName = dropdownName;
	}
	
	
	

}
