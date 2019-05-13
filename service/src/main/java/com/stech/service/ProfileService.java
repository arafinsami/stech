package com.stech.service;

import static com.stech.enums.ActivityAction.PROFILE_CREATED;
import static com.stech.enums.ModuleName.PROFILE;
import static java.lang.String.valueOf;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.stech.entity.Profile;
import com.stech.entity.User;
import com.stech.enums.ActivityAction;
import com.stech.repository.ProfileRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfileService {

	private final ProfileRepository repository;
	private final ActionLogService actionLogService;
	private final AttachmentService attachmentService;

	@Transactional
	public void save(User user, Profile command) {

		repository.save(command);
		repository.save(command);
		actionLogService.publishActivity(PROFILE, PROFILE_CREATED, valueOf(command.getId()), user.getUserName(),
				"User Profile Created", true);
	}

	@Transactional
	public Profile save(Profile command, ActivityAction action, String comments) {

		Profile profile = repository.save(command);
		repository.save(command);
		actionLogService.publishActivity(PROFILE, action, valueOf(profile.getId()), comments);
		return profile;
	}

	public Profile findByUser(User user) {
		return repository.findByUser(user);
	}
}
