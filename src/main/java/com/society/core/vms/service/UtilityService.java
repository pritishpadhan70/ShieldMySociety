package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.DropDownField;
import com.society.core.vms.exceptions.SocietyException;

public interface UtilityService {

	List<DropDownField> getDropdownFileds(String dropdownType, long referenceId) throws SocietyException;

}
