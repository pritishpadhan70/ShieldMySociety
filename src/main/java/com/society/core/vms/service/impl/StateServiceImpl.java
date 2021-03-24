/**
 * 
 */
package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.dto.StateDTO;
import com.society.core.vms.entity.State;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.repository.StateRepository;
import com.society.core.vms.service.StateService;
import com.society.core.vms.util.ConversionUtility;

/**
 * @author deepikadas
 *
 */

@Service("stateService")
@Transactional
public class StateServiceImpl implements StateService {
	
	@Autowired
	private StateRepository repository;

	@Override
	public List<StateDTO> getStateListService() throws DataNotFoundException {

		List<State> states = repository.findAll();
		if (states.isEmpty()) {
			throw new DataNotFoundException("NO STATE Data ");
		}

		return ConversionUtility.stateEntityListToDataObject(states);

	}

	@Override
	public StateDTO getSingleStateByIdService(long stateId) throws DataNotFoundException {

		State state = repository.findByStateId(stateId);
		if (null == state) {
			System.out.println("NO Flat data  ID: " + stateId);
			throw new DataNotFoundException("NO State Data ");
		}
		return ConversionUtility.entityToDataObject(state);

	}

	@Override
	public List<StateDTO> findStatesByCountryService(Long countryId) throws DataNotFoundException {
		
		List<State> state = repository.findByCountryId(countryId);
		if(null == state || state.isEmpty()) {
			
			throw new DataNotFoundException("NO state defined for cointryId: "+ countryId);
		}
		return ConversionUtility.stateEntityListToDataObject(state);

	}

	
	

}
