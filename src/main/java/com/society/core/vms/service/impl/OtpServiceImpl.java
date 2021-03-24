package com.society.core.vms.service.impl;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.GlobalUserDTO;
import com.society.core.vms.entity.GlobalUser;
import com.society.core.vms.entity.UserOtp;
import com.society.core.vms.exceptions.OtpException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.exceptions.SocietyException;
import com.society.core.vms.repository.OtpRepository;
import com.society.core.vms.repository.UserRepository;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.request.KeyValueRequest;
import com.society.core.vms.request.PhoneEmailRequest;
import com.society.core.vms.service.OtpService;
import com.society.core.vms.util.ApplicationConstants;
import com.society.core.vms.util.ConversionUtility;
import com.society.core.vms.util.EmailService;
import com.society.core.vms.util.UtilityMethods;

@Service
public class OtpServiceImpl implements OtpService {

	
	@Autowired
	OtpRepository repository;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public String createOtpervice(PhoneEmailRequest request) throws SocietyException {
		int otpNum = Integer.parseInt(UtilityMethods.getOTPString());
		
		//UserOtp testOtp = repository.findByPhoneOrEmail(request.getPhone(), request.getEmail());
		UserOtp testOtp = repository.findTop1ByPhoneOrderByOtpIdDesc(request.getPhone());
		
		if(null != testOtp && UtilityMethods.getTimeStampDifference(testOtp.getCreatedTime(), UtilityMethods.getCurrentTimeStamp(),
				ApplicationConstants.MINUTE) < ApplicationConstants.OTP_TIMEOUT_IN_MINS) {
			throw new OtpException("Already Phone/Email Exist, try After sometime");
		}
		UserOtp otp = new UserOtp(0l, UtilityMethods.getCurrentTimeStamp(),
				request.getEmail(), true, "Registration",otpNum , request.getPhone());
		
		otp = repository.save(otp);
		
		// Trigger mail & SMS
		//MessageFormat.format(ApplicationConstants.OTP_BODY, otp.getPhone(), otpNum + 2 +ApplicationConstants.MINUTE);
		EmailService.send( otp.getEmail(), ApplicationConstants.OTP_SUBJECT,
				MessageFormat.format(ApplicationConstants.OTP_BODY, otp.getPhone(), otpNum , 2 + " " + ApplicationConstants.MINUTES));
		
		System.out.println("Otp saved with value: " + otpNum+" ID: " + otp.getOtpId());
		return "otp generated and sent to your phone/email";
	}

	@Override
	public GlobalUserDTO verifyOtpPhoneService(KeyValueRequest request) throws SocietyException {
		
		//Pageable topOne = PageRequest.of(0, 1);
		UserOtp otp = repository.findTop1ByPhoneOrderByOtpIdDesc(request.getKey());
		if(null ==otp || !otp.getIsActive()) {
			throw new OtpException("NO OTP against your contact details.");
		}
		// OTP validation condition
		if (!(otp.getOtpValue() == Integer.parseInt(request.getValue()))) {
			throw new OtpException("WRONG OTP");

		}
		//OTP Timeout check
		if (UtilityMethods.getTimeStampDifference(otp.getCreatedTime(), UtilityMethods.getCurrentTimeStamp(),
				ApplicationConstants.MINUTE) > ApplicationConstants.OTP_TIMEOUT_IN_MINS) {
			throw new OtpException("OTP Timed out");

		}
		System.out.println("otp Validated succesfully, OTPID: "+ otp.getOtpId());
		
		
		//if user exists
		GlobalUser user = userRepository.findByUserPhoneOrUserEmail(otp.getPhone(), otp.getEmail());
		

		if (null!=user){
			System.out.println("user phone: " + otp.getPhone() + ", user email: " + otp.getEmail());
			throw new PersistanceException("user alredy registered with this phone or email");

		}
		user = new GlobalUser();
		user.setUserPhone(otp.getPhone());
		user.setUserEmail(otp.getEmail());
		user = userRepository.save(user);
		
		if(null ==user){
			throw new PersistanceException("Exception in saving User");
		}
		otp.setVerified(true);
		repository.save(otp);//updated otp status.
		System.out.println("User Created for OTP Validation with UaerId: "+ user.getUserId());

		return ConversionUtility.entityToDataObject(user);
	}
	
	
	
	@Override
	public GlobalUserDTO verifyOtpUserRegdService(int optValue) throws SocietyException, OtpException {
		
		UserOtp otp = repository.findTop1ByOtpValue(optValue);
		
		if(null ==otp || !otp.getIsActive()) {
			throw new OtpException("Not a valid OTP ");
		}

		//OTP Timeout check
		if (UtilityMethods.getTimeStampDifference(otp.getCreatedTime(), UtilityMethods.getCurrentTimeStamp(),
				ApplicationConstants.MINUTE) > ApplicationConstants.OTP_TIMEOUT_IN_MINS) {
			throw new OtpException("OTP Timed out");

		}
		
		System.out.println("otp Validated succesfully, OTPID: "+ otp.getOtpId());
		
		
		//if user exists
		GlobalUser user = userRepository.findByUserPhoneOrUserEmail(otp.getPhone(), otp.getEmail());
		

		if (null!=user){
			System.out.println("user phone: " + otp.getPhone() + ", user email: " + otp.getEmail());
			throw new PersistanceException("user alredy registered with this phone or email");

		}
		user = new GlobalUser();
		user.setUserPhone(otp.getPhone());
		user.setUserEmail(otp.getEmail());
		user = userRepository.save(user);
		
		if(null ==user){
			throw new PersistanceException("Exception in saving User");
		}
		otp.setVerified(true);
		repository.save(otp);//updated otp status.
		System.out.println("User Created for OTP Validation with UaerId: "+ user.getUserId());

		return ConversionUtility.entityToDataObject(user);
	}

}
