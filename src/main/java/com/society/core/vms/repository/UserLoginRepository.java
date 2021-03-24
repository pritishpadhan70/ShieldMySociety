package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.entity.GlobalUserLogin;

public interface UserLoginRepository extends CrudRepository<GlobalUserLogin, Long> {

	List<GlobalUserLogin> findAll();

	@Query("SELECT u from GlobalUserLogin u where u.userName=:user and u.password=:pass")
	GlobalUserLogin login(@Param("user") String user, @Param("pass")String pass);
	
	GlobalUserLogin findByUserName(String user);
	
	GlobalUserLogin findByUserId(long userId);

	@Modifying
	@Transactional
	@Query("UPDATE GlobalUserLogin u SET u.password=:newPassword WHERE  u.userId=:userId")
	int changePassword(@Param("userId") Long userId, @Param("newPassword") String newPassword);

	GlobalUserLogin findByUserIdAndPassword(Long userId, String oldPassword);

	//@Query("UPDATE GlobalUserLogin u SET u.password=:newPassword WHERE  u.userId=:userId")
	//int changePassword(@Param("userId") String userId, @Param("newPassword")String newPassword);

	//@Query("UPDATE GlobalUser u SET u.password=:newPassword WHERE  u.userPhone=:userPhone")
	//int changePasswordPhone(@Param("userPhone") String userPhone, @Param("newPassword")String newPassword);



	


}
