package com.society.core.vms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the DISTRICT database table.
 * 
 */
@Entity
@NamedQuery(name="City.findAll", query="SELECT d FROM City d")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CITY_ID")
	private Integer cid;

	@Column(name="CITY_NAME")
	private String cityName;

	@Column(name="DISTRICT_ID")
	private Integer districtId;

	public City() {
	}

	
	/**
	 * @param cid
	 * @param cityName
	 * @param districtId
	 */
	public City(Integer cid, String cityName, Integer districtId) {
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