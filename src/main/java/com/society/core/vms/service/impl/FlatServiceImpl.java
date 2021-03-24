/**
 * 
 */
package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.dto.FlatDTO;
import com.society.core.vms.entity.Flat;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.FlatRepository;
import com.society.core.vms.service.FlatService;
import com.society.core.vms.util.ConversionUtility;
import com.society.core.vms.util.UtilityMethods;

/**
 * @author deepikadas
 *
 */

@Service("flatService")
@Transactional
public class FlatServiceImpl implements FlatService {
	
	@Autowired
	private FlatRepository repository;

	@Override
	public List<FlatDTO> getFlatListService() throws DataNotFoundException{
		
		List<Flat> flats = repository.findAll();
		if (flats.isEmpty()) {
			throw new DataNotFoundException("NO FLAT Data ");
		}
		
		return ConversionUtility.flatEntityToDataObject(flats);
	}

	@Override
	public FlatDTO getSingleFlatByIdService(long flatId) throws DataNotFoundException {
		Flat flat = repository.findByFlatId(flatId);
		if (null == flat) {
			System.out.println("NO Flat data  ID: "+ flatId);
			throw new DataNotFoundException("NO FLAT Data ");
		}
		return ConversionUtility.entityToDataObject(flat);
	}

	@Override
	public FlatDTO getSingleFlatByFlatNameService(String flatName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatDTO getSingleFlatByPhoneService(long phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatDTO getSingleFlatByIdProofService(String idType, String idNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveSingleFlatDataService(FlatDTO data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveFlatDataListService(List<FlatDTO> dataList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSingleFlatService(long flatId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFlatListService(List<Long> flatids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disableSingleFlatService(long flatId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disableFlatListService(List<Long> flatids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableSingleFlatService(long flatId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableFlatListService(List<Long> flatids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String createUpdateFlatService(FlatDTO dto) throws PersistanceException, InvalidInputDataException {

		//UtilityMethods.validateFlatObject(dto);
		Flat entity = repository.save(ConversionUtility.dataObjectToentity(dto));
		
		if (entity == null) {
			throw new PersistanceException("Flat not saved");
		}

		return "Flat succesfull saved with ID: " + entity.getFlatId();

	}

	

}
