package com.stech.security;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.stech.entity.UserActivityLog;
import com.stech.repository.mongo.UserActivityLogRepository;
import com.stech.utils.WebUtils;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SecurityChecker {

	private final UserActivityLogRepository userActivityLogRepository;

	public List<UserActivityLog> getUserIpBySession(String userName) {

		List<UserActivityLog> userActivityLogs = userActivityLogRepository.findByUserName(userName);
		List<UserActivityLog> userActivityStream = userActivityLogs.stream()
				.filter(
						 u -> u.getUserName().equals(userName)
						 && 
						 u.getIpAddress().equals(WebUtils.getCurrentRequest().getRemoteAddr())
					   )
				.collect(Collectors.toList());
		return userActivityStream;
	}
}


