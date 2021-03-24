package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.AddressDropdowns;
import com.society.core.vms.dto.ChangePassword;
import com.society.core.vms.dto.GlobalUserDTO;
import com.society.core.vms.dto.LoginDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.LoginException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.exceptions.SocietyException;

public interface UserService {
	
	List<GlobalUserDTO> getUserListService() throws DataNotFoundException;
	
	/**
	 * Method for Login and sends back User Profile data.
	 * @param login
	 * @return user profile
	 * @throws LoginException
	 */
	GlobalUserDTO loginService(LoginDTO login) throws LoginException;
	
	GlobalUserDTO getSingleUserByIdService(long userId) throws LoginException;

	GlobalUserDTO getSingleUserByUserNameService(String userName);
	
	GlobalUserDTO getSingleUserByPhoneService(String phone);
	
	GlobalUserDTO getSingleUserByIdProofService(String idType,String idNumber);
	
	boolean saveSingleUserDataService(GlobalUserDTO data);
	
	boolean saveUserDataListService(List<GlobalUserDTO> dataList);
	
	boolean deleteSingleUserService(long userId);
	
	boolean deleteUserListService(List<Long> userids);
	
	boolean disableSingleUserService(long userId);
	
	boolean disableUserListService(List<Long> userids);
	
	boolean enableSingleUserService(long userId);
	
	boolean enableUserListService(List<Long> userids);

	String createUpdateUserService(GlobalUserDTO user) throws PersistanceException, InvalidInputDataException;

	AddressDropdowns getUserDropdown(GlobalUserDTO user) throws DataNotFoundException, InvalidInputDataException;

	String resetPasswordService(long id) throws InvalidInputDataException, DataNotFoundException;

	Object changePasswordService(ChangePassword pass) throws InvalidInputDataException, DataNotFoundException;

	Object logoutService(GlobalUserDTO user) throws SocietyException;

	String forgotPasswordService(String id) throws InvalidInputDataException, DataNotFoundException;




}
