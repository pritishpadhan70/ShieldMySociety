package com.society.core.vms.service;

import com.society.core.vms.dto.GlobalUserDTO;
import com.society.core.vms.exceptions.OtpException;
import com.society.core.vms.exceptions.SocietyException;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.request.KeyValueRequest;
import com.society.core.vms.request.PhoneEmailRequest;

public interface OtpService {

	String createOtpervice(PhoneEmailRequest request) throws SocietyException;

	GlobalUserDTO verifyOtpPhoneService(KeyValueRequest request) throws SocietyException;

	GlobalUserDTO verifyOtpUserRegdService(int otpValue) throws SocietyException, OtpException;
	

}
