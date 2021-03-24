package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The DTO class for the DISTRICT data.
 * 
 */
public class DistrictDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String districtName;
	private Long stateId;

	public DistrictDTO() {
	}

	
	/**
	 * @param id
	 * @param districtName
	 * @param stateId
	 */
	public DistrictDTO(Long id, String districtName, Long stateId) {
		super();
		this.id = id;
		this.districtName = districtName;
		this.stateId = stateId;
	}


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Long getStateId() {
		return this.stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

}