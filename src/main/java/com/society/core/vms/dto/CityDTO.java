package com.society.core.vms.dto;


import java.io.Serializable;


/**
 * The DTO class for the DISTRICT data.
 * 
 */
public class CityDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 139757375267725012L;
	private Integer cid;
	private String cityName;
	private Integer districtId;

	public CityDTO() {
	}

	
	/**
	 * @param cid
	 * @param cityName
	 * @param districtId
	 */
	public CityDTO(Integer cid, String cityName, Integer districtId) {
		super();
		this.cid = cid;
		this.cityName = cityName;
		this.districtId = districtId;
	}


	/**
	 * @return the cid
	 */
	public Integer getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the districtId
	 */
	public Integer getDistrictId() {
		return districtId;
	}

	/**
	 * @param districtId the districtId to set
	 */
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	
}