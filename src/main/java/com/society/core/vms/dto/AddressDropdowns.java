package com.society.core.vms.dto;

import java.io.Serializable;
import java.util.List;

public class AddressDropdowns implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7462654985505923320L;

	private List<CountryDTO> countryList;
	private List<StateDTO> stateList;
	private List<DistrictDTO> districtList;
	private List<CityDTO> cityList;
	
	
	
	/**
	 * 
	 */
	public AddressDropdowns() {
	}



	/**
	 * @param countryList
	 * @param stateList
	 * @param districtList
	 * @param cityList
	 */
	public AddressDropdowns(List<CountryDTO> countryList, List<StateDTO> stateList, List<DistrictDTO> districtList,
			List<CityDTO> cityList) {
		super();
		this.countryList = countryList;
		this.stateList = stateList;
		this.districtList = districtList;
		this.cityList = cityList;
	}



	/**
	 * @return the countryList
	 */
	public List<CountryDTO> getCountryList() {
		return countryList;
	}



	/**
	 * @param countryList the countryList to set
	 */
	public void setCountryList(List<CountryDTO> countryList) {
		this.countryList = countryList;
	}



	/**
	 * @return the stateList
	 */
	public List<StateDTO> getStateList() {
		return stateList;
	}



	/**
	 * @param stateList the stateList to set
	 */
	public void setStateList(List<StateDTO> stateList) {
		this.stateList = stateList;
	}



	/**
	 * @return the districtList
	 */
	public List<DistrictDTO> getDistrictList() {
		return districtList;
	}



	/**
	 * @param districtList the districtList to set
	 */
	public void setDistrictList(List<DistrictDTO> districtList) {
		this.districtList = districtList;
	}



	/**
	 * @return the cityList
	 */
	public List<CityDTO> getCityList() {
		return cityList;
	}



	/**
	 * @param cityList the cityList to set
	 */
	public void setCityList(List<CityDTO> cityList) {
		this.cityList = cityList;
	}
	
	
	
	
}
