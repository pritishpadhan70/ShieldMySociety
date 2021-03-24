package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.CountryDTO;
import com.society.core.vms.exceptions.DataNotFoundException;

public interface CountryService {
	
	List<CountryDTO> getCountryListService() throws DataNotFoundException;
	
	CountryDTO getSingleCountryByIdService(long countryId) throws DataNotFoundException;

	
}
