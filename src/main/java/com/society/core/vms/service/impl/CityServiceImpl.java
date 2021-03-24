package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.CityDTO;
import com.society.core.vms.entity.City;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.repository.CityRepository;
import com.society.core.vms.service.CityService;
import com.society.core.vms.util.ConversionUtility;

@Service("cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	CityRepository repository;

	@Override
	public List<CityDTO> getCityListService() throws DataNotFoundException {

		List<City> entities = repository.findAll();
		if (entities.isEmpty()) {
			throw new DataNotFoundException("NO city Data ");
		}

		return ConversionUtility.cityEntityListToDataObject(entities);

	}

	@Override
	public CityDTO getSingleCityByIdService(Integer cityId) throws DataNotFoundException {

		City entity = repository.findByCid(cityId);
		if (entity == null) {
			throw new DataNotFoundException("NO city Data for id: " + cityId);
		}
		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public List<CityDTO> findCitiesByDistrictService(Integer districtId) throws DataNotFoundException {

		List<City> entities = repository.findByDistrictId(districtId);
		if (entities.isEmpty()) {
			throw new DataNotFoundException("NO city Data ");
		}

		return ConversionUtility.cityEntityListToDataObject(entities);
	}

}
