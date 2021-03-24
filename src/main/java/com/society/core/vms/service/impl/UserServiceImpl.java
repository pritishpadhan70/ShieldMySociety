/**
 * 
 */
package com.society.core.vms.service.impl;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.dto.AddressDropdowns;
import com.society.core.vms.dto.ChangePassword;
import com.society.core.vms.dto.CityDTO;
import com.society.core.vms.dto.CountryDTO;
import com.society.core.vms.dto.DistrictDTO;
import com.society.core.vms.dto.GlobalUserDTO;
import com.society.core.vms.dto.LoginDTO;
import com.society.core.vms.dto.StateDTO;
import com.society.core.vms.entity.GlobalUser;
import com.society.core.vms.entity.GlobalUserLogin;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.LoginException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.exceptions.SocietyException;
import com.society.core.vms.repository.UserLoginRepository;
import com.society.core.vms.repository.UserRepository;
import com.society.core.vms.service.CityService;
import com.society.core.vms.service.CountryService;
import com.society.core.vms.service.DistrictService;
import com.society.core.vms.service.StateService;
import com.society.core.vms.service.UserService;
import com.society.core.vms.util.ApplicationConstants;
import com.society.core.vms.util.ConversionUtility;
import com.society.core.vms.util.EmailService;
import com.society.core.vms.util.UtilityMethods;

/**
 * @author deepikadas
 *
 */

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private UserLoginRepository loginRepository;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private DistrictService districtService;
	
	@Autowired
	private CityService cityService;

	@Override
	public List<GlobalUserDTO> getUserListService() throws DataNotFoundException{
		
		List<GlobalUser> globalUsers = repository.findAll();
		if (globalUsers.isEmpty()) {
			throw new DataNotFoundException("NO User Data ");
		}
		
		return ConversionUtility.entityToDataObject(globalUsers);
	}

	@Override
	public GlobalUserDTO loginService(LoginDTO login) throws LoginException {

		GlobalUserDTO dto=null;
		GlobalUserLogin userEntity = loginRepository.findByUserName(login.getUserName());
		// repository.login(login.getUserName(), login.getPassword());
		if (null == userEntity) {
			System.out.println("Invalid login");
			throw new LoginException("Invalid login");
		}
		
		if (!login.getPassword().equals(userEntity.getPassword())) {
			System.out.println("Invalid Password");
			throw new LoginException("Invalid Password");
		}
		
		if(userEntity.getWrongPassCount() >= ApplicationConstants.WRONG_PASSWORD_ALLOWED_USER) {
			userEntity.setEnabled(false);
			loginRepository.save(userEntity);
			throw new LoginException("You have tried maximum login attempt, Your account is locked, contact admin/customer care");
		}
		
		if(!userEntity.isEnabled()) {
			throw new LoginException("Your account is locked, contact admin/customer care");
		}
		
		if(userEntity.isForceChangePassword()) {
			dto = new GlobalUserDTO(userEntity.getUserId(),
					userEntity.getFirstName(), userEntity.getMiddleName(), userEntity.getLastName(), true);
			return dto;
		}
		
		GlobalUser  user =repository.findByUserName(login.getUserName());
		System.out.println("Valid Login...");
		//dto = ConversionUtility.entityToDataObject(user);
		return ConversionUtility.entityToDataObject(user);
	}

	
	
	@Override
	public GlobalUserDTO getSingleUserByIdService(long userId) throws LoginException {

		GlobalUser user = repository.findByUserId(userId);
		if (null == user) {
			System.out.println("Invalid USER_ID, : " + userId);
			throw new LoginException("Invalid User ID");
		}
		return ConversionUtility.entityToDataObject(user);
	}

	@Override
	public GlobalUserDTO getSingleUserByUserNameService(String userName) {
		
		GlobalUser entity = repository.findByUserName(userName);
		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public GlobalUserDTO getSingleUserByPhoneService(String phone) {
		// TODO Auto-generated method stub
		return ConversionUtility.entityToDataObject(repository.findByUserPhone(phone));
	}

	@Override
	public GlobalUserDTO getSingleUserByIdProofService(String idType, String idNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveSingleUserDataService(GlobalUserDTO data) {
		
		return (null ==repository.save(ConversionUtility.dataObjectToEntity(data)));
	}

	@Override
	public boolean saveUserDataListService(List<GlobalUserDTO> dataList) {
		repository.saveAll( ConversionUtility.dataObjectToEntity(dataList));
		return false;
	}

	@Override
	public boolean deleteSingleUserService(long userId) {
		repository.deleteById(userId);
		return true;
	}

	@Override
	public boolean deleteUserListService(List<Long> userids) {
		repository.deleteByUserIdIn(userids);
		return true;
	}

	@Override
	public boolean disableSingleUserService(long userId) {
		repository.enableDisableUser(userId,false);
		return false;
	}

	@Override
	public boolean disableUserListService(List<Long> userids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableSingleUserService(long userId) {
		
		repository.enableDisableUser(userId,true);
		return false;
	}

	@Override
	public boolean enableUserListService(List<Long> userids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String createUpdateUserService(GlobalUserDTO user) throws PersistanceException, InvalidInputDataException {

		if (user == null) {
			throw new InvalidInputDataException("User object is invalid");
		}
		GlobalUser entity = ConversionUtility.dataObjectToEntity(user);
		
		if(entity.getUserId()!=null) {
			entity.setRegdComplete(true);
		}
		try {
			
			entity = repository.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistanceException(e.getLocalizedMessage());
		}
		if (user.getUserId() == null) {
			System.out.println(MessageFormat.format(ApplicationConstants.USER_SAVED, entity.getUserName(),
					" With UserId: " + entity.getUserId()));
			return MessageFormat.format(ApplicationConstants.USER_SAVED, entity.getUserName());

		} else {
			System.out.println(MessageFormat.format(ApplicationConstants.USER_UPDATED, entity.getUserName(),
					" With UserId: " + entity.getUserId()));
			return MessageFormat.format(ApplicationConstants.USER_SAVED, entity.getUserName());

		}
	}


	@Override
	public AddressDropdowns getUserDropdown(GlobalUserDTO user) throws DataNotFoundException, InvalidInputDataException{
		
		if (user == null) {
			throw new InvalidInputDataException("User object is invalid");
		}
		List<CountryDTO> countryList = countryService.getCountryListService();
		if(user.getAddCountry()==0) {
			return   new AddressDropdowns(countryList,null, null, null);
		}
		List<StateDTO> stateList = null;
		List<DistrictDTO> districtList = null;
		List<CityDTO> cityList = null;
		
		try {
			stateList = stateService.findStatesByCountryService(Long.valueOf(user.getAddCountry()));
			districtList = districtService.findDistrictsByStateService(Long.valueOf(user.getAddState()));
			cityList = cityService.findCitiesByDistrictService( user.getAddDistrict());
		}
		catch(DataNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return   new AddressDropdowns(countryList,stateList, districtList, cityList);
	}

	@Override
	public String resetPasswordService(long id) throws InvalidInputDataException, DataNotFoundException {
		// TODO Auto-generated method stub
		
		GlobalUser user = repository.findByUserId(id);
		if (null==user) {
			throw new InvalidInputDataException("invalid ID for password reset");
		}
		
		//set random password
		String password = UtilityMethods.getRamdomCode(
				ApplicationConstants.GENARATED_PASSCODE_SIZE_USER, true, true);
		int updateStatus = loginRepository.changePassword(user.getUserId(),password);
		System.out.println("Updated status: "+ updateStatus);

		// trigger mail
		EmailService.send(user.getUserEmail(), "Password Reset", " Hi "+user.getFirstName() +",\n Your password has been  reset By Admin, temporary password is "+password);
		return "Password reset succesfully, check your registered mail for further setps";
	}

	@Override
	public String changePasswordService(ChangePassword pass) throws InvalidInputDataException, DataNotFoundException {
		
		UtilityMethods.verifyChangePasswordObject(pass);//password input object verification
		GlobalUserLogin user = loginRepository.findByUserIdAndPassword(pass.getUserId(),pass.getOldPassword());
		if(user==null) {
			throw new InvalidInputDataException("Wrong old password value provided/ invalid UserId");
		}
		//int updateStatus = loginRepository.changePassword(pass.getUserId(), pass.getNewPassword());
		user.setPassword(pass.getNewPassword());
		user = loginRepository.save(user);
		System.out.println("Updated status: "+ user);

		String email = repository.findEmailByUserId(pass.getUserId()); // notification mail to User
		EmailService.send(email, "Password Changed", "Your password has been  Changed");

		return "Password changed succesfully";
	}

	@Override
	public String forgotPasswordService(String id) throws InvalidInputDataException, DataNotFoundException {

		if(id==null || id.trim().isEmpty()) {
			throw new InvalidInputDataException("invalid Email/Phone for password reset");

		}
		id = id.trim();
		int updateStatus = 0;
		//match by email
		if(UtilityMethods.isValidEmail(id)) 
		{
			GlobalUser user = repository.findByUserEmail(id);
			if(user==null) {
				throw new InvalidInputDataException("No User Exist with this emailID: " + id);

			}
			String password = UtilityMethods.getRamdomCode(
					ApplicationConstants.GENARATED_PASSCODE_SIZE_USER, true, true);
			updateStatus = loginRepository.changePassword(user.getUserId(),password);
			EmailService.send(id, "Password Reset", " Hi "+user.getFirstName() +",\n Your password has been  reset by you, temporary password is " + password);
			
			// TODO sms trigger

		}
		
		
		//match by phone
		if(UtilityMethods.isValidPhone(id)) {
			GlobalUser user = repository.findByUserPhone(id);
			if(user==null) {
				throw new InvalidInputDataException("No User Exist with this Phone no: " + id);

			}

			String password = UtilityMethods.getRamdomCode(
					ApplicationConstants.GENARATED_PASSCODE_SIZE_USER, true, true);
			updateStatus = loginRepository.changePassword(user.getUserId(), password);
			// trigger mail
			EmailService.send(user.getUserEmail(), "Password Reset", "Your password has been  reset By you, temporary password is " + password);
			
			// TODO sms trigger
		}
		System.out.println("Updated status: "+ updateStatus);

		if(updateStatus==0) {
			
			throw new InvalidInputDataException("The Input is neither a phone nor a valid email  ID");
			
		}

		return "Password reset succesfully, check your registered mail for further setps";
	}
	
	
	@Override
	public String logoutService(GlobalUserDTO user) throws SocietyException {
		// TODO Auto-generated method stub
		return "You have loggedout succesfully";
	}



}
