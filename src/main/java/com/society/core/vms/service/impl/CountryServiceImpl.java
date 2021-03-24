/**
 * 
 */
package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.dto.CountryDTO;
import com.society.core.vms.entity.Country;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.repository.CountryRepository;
import com.society.core.vms.service.CountryService;
import com.society.core.vms.util.ConversionUtility;

/**
 * @author deepikadas
 *
 */

@Service("countryService")
@Transactional
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryRepository repository;

	@Override
	public List<CountryDTO> getCountryListService() throws DataNotFoundException {

		List<Country> contries = repository.findAll();
		if (contries.isEmpty()) {
			throw new DataNotFoundException("NO COUNRTY Data ");
		}

		return ConversionUtility.countryEntityListToDataObject(contries);

	}

	@Override
	public CountryDTO getSingleCountryByIdService(long counrtryId) throws DataNotFoundException {

		Country country = repository.findByCountryId(counrtryId);
		if (null == country) {
			System.out.println("NO COUNRTY data  ID: " + counrtryId);
			throw new DataNotFoundException("NO COUNRTY Data ");
		}
		return ConversionUtility.entityToDataObject(country);

	}

	
	

}
