package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The DTO class for the COUNTRY data.
 * 
 */
public class CountryDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long countryId;
	private String continent;
	private String countryName;

	public CountryDTO() {
	}

	
	
	/**
	 * @param countryId
	 * @param continent
	 * @param countryName
	 */
	public CountryDTO(Long countryId, String continent, String countryName) {
		super();
		this.countryId = countryId;
		this.continent = continent;
		this.countryName = countryName;
	}



	public Long getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getContinent() {
		return this.continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}