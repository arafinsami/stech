package com.stech.service;

import static java.util.Objects.nonNull;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stech.entity.User;
import com.stech.entity.UserActivityLog;
import com.stech.enums.ActivityAction;
import com.stech.repository.mongo.UserActivityLogRepository;
import com.stech.utils.WebUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserActivityLogService {

	private final UserActivityLogRepository userActivityLogRepository;

	@Transactional
	public void publishActivity(User user, String authId, ActivityAction action) {

		UserActivityLog userActivityLog = new UserActivityLog();

		userActivityLog.setCreated(new Date());
		userActivityLog.setAction(action.getLabel());
		userActivityLog.setIpAddress(WebUtils.getCurrentRequest().getRemoteAddr());
		userActivityLog.setAuthId(authId);
		if (nonNull(user)) {
			userActivityLog.setUserId(user.getId());
			userActivityLog.setUserName(user.getUserName());
		}
		userActivityLogRepository.save(userActivityLog);
	}

}
