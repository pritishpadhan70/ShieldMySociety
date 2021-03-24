package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.NotificationDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.request.KeyValueRequest;

public interface NotificationService {

	NotificationDTO getOneNOtificationByIdService(long id) throws DataNotFoundException;

	List<NotificationDTO> getNofiicationsForUserService(IdNumberRequest request) throws DataNotFoundException;

	String createNotificationService(NotificationDTO request) throws PersistanceException, InvalidInputDataException;

	String createGroupNotificationService(NotificationDTO request, Long roleId, Long societyId)
			throws PersistanceException, InvalidInputDataException;


}
