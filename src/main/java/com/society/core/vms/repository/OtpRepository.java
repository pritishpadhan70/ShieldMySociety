package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.UserOtp;

public interface OtpRepository extends CrudRepository<UserOtp, Long> {

	List<UserOtp> findAll();
	
	UserOtp findByEmail(String emailId);
	//UserOtp findByPhone(String phoneNumber);
	UserOtp findTop1ByPhoneOrderByOtpIdDesc(String phoneNumber);
	UserOtp findByOtpId(Long otpId);
	UserOtp findTop1ByOtpValue(int otp);
	
	UserOtp findByPhoneOrEmail(String phoneNumber, String emailId);

}
