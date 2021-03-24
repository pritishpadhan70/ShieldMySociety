package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.CityDTO;
import com.society.core.vms.exceptions.DataNotFoundException;

public interface CityService {

	List<CityDTO> getCityListService() throws DataNotFoundException;

	CityDTO getSingleCityByIdService(Integer cityId) throws DataNotFoundException;

	List<CityDTO> findCitiesByDistrictService(Integer districtId) throws DataNotFoundException;

}
