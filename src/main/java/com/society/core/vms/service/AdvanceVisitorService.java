package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.AdvanceVisitorRequestDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.OtpException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.KeyValueRequest;

public interface AdvanceVisitorService {

	List<AdvanceVisitorRequestDTO> getAdvVisitorListService()throws DataNotFoundException;

	AdvanceVisitorRequestDTO getSingleVisitorByIdService(long visitorId) throws DataNotFoundException;

	String createAdvVisitorService(AdvanceVisitorRequestDTO request)throws PersistanceException;

	String verifyAdvVisitorRequestService(KeyValueRequest request) throws PersistanceException, OtpException;

}
