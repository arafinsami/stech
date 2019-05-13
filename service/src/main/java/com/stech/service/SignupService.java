package com.stech.service;

import static com.stech.enums.ActivityAction.*;
import static com.stech.enums.ModuleName.*;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.stech.entity.User;
import com.stech.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SignupService {

	private final UserRepository userRepository;
	private final ActionLogService actionLogService;

	@Transactional
	public void saveCompanyUser(User user) {

		userRepository.save(user);
		actionLogService.publishActivity(
				                         SERVICE_SEEKER_SIGNUP, 
				                         SIGNUP, 
				                         String.valueOf(user.getId()), 
				                         user.getUserName(),
				                         "Service Seeker User Created", 
				                         true
				                        );
	}

	@Transactional
	public void saveIndividualUser(User user) {

		userRepository.save(user);
		actionLogService.publishActivity(
				                         SERVICE_PROVIDER_SIGNUP,
				                         SIGNUP,
				                         String.valueOf(user.getId()),
				                         user.getUserName(),
				                         "Service Provider User Created",
				                         true
				                         );
	}

}
