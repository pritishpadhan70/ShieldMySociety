package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.NotificationDTO;
import com.society.core.vms.entity.Notification;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.NotificationRepository;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.service.NotificationService;
import com.society.core.vms.util.ConversionUtility;

@Service("notificationService")
public class NotificationServiceImpl implements NotificationService {
	
	@Autowired
	NotificationRepository repository;

	@Override
	public NotificationDTO getOneNOtificationByIdService(long id) throws DataNotFoundException {

		Notification entity = repository.findByNid(id);
		if(entity == null) {
			throw new DataNotFoundException(" no notification found for given ID");
		}
		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public List<NotificationDTO> getNofiicationsForUserService(IdNumberRequest request) throws DataNotFoundException {

		List<Notification> entities = repository.findByForUser(request.getId());
		if(entities == null || entities.isEmpty()) {
			throw new DataNotFoundException("No new notification fou you");
		}
		return ConversionUtility.notificationEntityListToDataObject(entities);
	}

	@Override
	public String createNotificationService(NotificationDTO request) throws PersistanceException, InvalidInputDataException {
		
		repository.save(ConversionUtility.dataObjectToEntity(request));
		
		return "Notification Created succefully";
	}


	@Override
	public String createGroupNotificationService(NotificationDTO request, Long roleId, Long societyId) throws PersistanceException, InvalidInputDataException {
		//TODO: implementation of Group notification.
		//repository.save(ConversionUtility.dataObjectToEntity(request));
		
		return "Group Notification Created succefully for Role: " + roleId + "Society: " + societyId ;
	}
}
