/**
 * 
 */
package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.dto.StaffDTO;
import com.society.core.vms.entity.Staff;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.repository.StaffRepository;
import com.society.core.vms.service.StaffService;
import com.society.core.vms.util.ConversionUtility;

/**
 * @author deepikadas
 *
 */

@Service("staffService")
@Transactional
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	private StaffRepository repository;

	@Override
	public List<StaffDTO> getStaffListService() throws DataNotFoundException {

		List<Staff> staff = repository.findAll();
		if (staff.isEmpty()) {
			throw new DataNotFoundException("NO Staff Data ");
		}

		return ConversionUtility.staffEntityListToDataObject(staff);

	}

	@Override
	public StaffDTO getSingleStaffByIdService(long staffId) throws DataNotFoundException {

		Staff staff = repository.findByStaffId(staffId);
		if (null == staff) {
			System.out.println("NO Flat data  ID: " + staffId);
			throw new DataNotFoundException("NO Staff Data ");
		}
		return ConversionUtility.entityToDataObject(staff);

	}

	
	

}
