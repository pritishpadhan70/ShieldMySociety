package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.society.core.vms.entity.GlobalUser;

public interface UserRepository extends CrudRepository<GlobalUser, Long> {

	List<GlobalUser> findAll();
	
	GlobalUser findByUserName(String user);

	GlobalUser findByUserId(long userId);

	GlobalUser findByUserPhone(String phone);

	GlobalUser findByUserPhoneOrUserEmail(String phone, String email);

	void deleteByUserIdIn(List<Long> userids);
	
	boolean existsByUserId(Long id);
	long count();

	@Query("update GlobalUser u set u.isEnabled =:status where u.userId =:userId")
	void enableDisableUser(@Param("userId") long userId, @Param("status") boolean status);
	
	@Query("select u.userEmail from  GlobalUser u where u.userId =:userId")
	String findEmailByUserId(@Param("userId") long userId);

	@Query("select u.userEmail from  GlobalUser u where u.userPhone =:phoneNumber")
	String findEmailByPhone(@Param("phoneNumber") String phoneNumber);

	GlobalUser findByUserEmail(String id);

	

	

}
