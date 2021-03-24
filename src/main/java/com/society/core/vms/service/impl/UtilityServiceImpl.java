package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.DropDownField;
import com.society.core.vms.exceptions.SocietyException;
import com.society.core.vms.repository.CountryRepository;
import com.society.core.vms.service.UtilityService;
import com.society.core.vms.util.ApplicationConstants;

@Service
public class UtilityServiceImpl implements UtilityService{
	
	@Autowired
	CountryRepository country;
	
	@Override
	public List<DropDownField> getDropdownFileds(String dropdownType, long referenceId) throws SocietyException{
		
		List<DropDownField>  ddlist = null ;
		
		switch (dropdownType) {

		case ApplicationConstants.COUNTRY:
			
			//return ConversionUtility.countryEntityListToDataObject(country.findAll());
			return ddlist;			
		case ApplicationConstants.STATE:
			//return diff / 1000;
			return ddlist;			

		case ApplicationConstants.DISTRICT:
			//return diff / (60 * 60 * 1000);
			return ddlist;			

		case ApplicationConstants.CITY:
			//return diff / (24 * 60 * 60 * 1000);
			return ddlist;			

		default:
			throw new SocietyException("Invalid entry: " + dropdownType);

		}
	}

}
