package com.stech.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.stech.entity.ActionLog;
import com.stech.enums.ActivityAction;
import com.stech.utils.WebUtils;
import com.stech.enums.ModuleName;
import com.stech.repository.mongo.ActionLogRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ActionLogService {

	private final ActionLogRepository actionLogRepository;

	@Transactional
	public void publishActivity(ModuleName moduleName, ActivityAction action, String documentId, String userName,
			String comments, boolean publicRequest) {

		ActionLog actionLog = new ActionLog();
		actionLog.setModuleName(moduleName);
		actionLog.setAction(action);
		actionLog.setDocumentId(documentId);
		actionLog.setUserName(userName);
		actionLog.setComments(comments);
		actionLog.setPublicRequest(publicRequest);
		actionLog.setIpAddress(WebUtils.getCurrentRequest().getRemoteAddr());
		actionLog.setCreated(new Date());
		actionLogRepository.save(actionLog);
	}
	
	@Transactional
	public void publishActivity(ModuleName moduleName, ActivityAction action, String documentId,
			String comments) {

		ActionLog actionLog = new ActionLog();
		actionLog.setModuleName(moduleName);
		actionLog.setAction(action);
		actionLog.setDocumentId(documentId);
		actionLog.setComments(comments);
		actionLog.setIpAddress(WebUtils.getCurrentRequest().getRemoteAddr());
		actionLog.setCreated(new Date());
		actionLogRepository.save(actionLog);
	}

}
