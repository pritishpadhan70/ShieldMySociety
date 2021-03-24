package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The DTO class for the STATE data.
 * 
 */
public class StateDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long stateId;
	private Long countryId;
	private String stateName;

	public StateDTO() {
	}

	
	
	/**
	 * @param stateId
	 * @param countryId
	 * @param stateName
	 */
	public StateDTO(Long stateId, Long countryId, String stateName) {
		super();
		this.stateId = stateId;
		this.countryId = countryId;
		this.stateName = stateName;
	}



	public Long getStateId() {
		return this.stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}