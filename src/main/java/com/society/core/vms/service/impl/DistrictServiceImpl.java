/**
 * 
 */
package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.dto.DistrictDTO;
import com.society.core.vms.entity.District;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.repository.DistrictRepository;
import com.society.core.vms.service.DistrictService;
import com.society.core.vms.util.ConversionUtility;

/**
 * @author deepikadas
 *
 */

@Service("districtService")
@Transactional
public class DistrictServiceImpl implements DistrictService {
	
	@Autowired
	private DistrictRepository repository;

	@Override
	public List<DistrictDTO> getDistrictListService() throws DataNotFoundException {

		List<District> districts = repository.findAll();
		if (districts.isEmpty()) {
			throw new DataNotFoundException("NO District Data ");
		}

		return ConversionUtility.districtEntityListToDataObject(districts);

	}

	@Override
	public DistrictDTO getSingleDistrictByIdService(long districtId) throws DataNotFoundException {

		District district = repository.findByDid(districtId);
		if (null == district) {
			System.out.println("NO District data  ID: " + districtId);
			throw new DataNotFoundException("NO District Data ");
		}
		return ConversionUtility.entityToDataObject(district);

	}

	@Override
	public List<DistrictDTO> findDistrictsByStateService(Long stateId) throws DataNotFoundException {
		
		List<District> districts = repository.findByStateId(stateId);
		
		return ConversionUtility.districtEntityListToDataObject(districts);
	}

	
	

}
