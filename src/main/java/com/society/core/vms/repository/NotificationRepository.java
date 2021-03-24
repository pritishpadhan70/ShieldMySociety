package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.Notification;

public interface NotificationRepository extends CrudRepository<Notification, Long> {

	List<Notification> findAll();

	Notification findByNid(long id);

	List<Notification> findByForUser(long id);
	


}
