package com.stech.service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stech.entity.AppSetup;
import com.stech.entity.User;
import com.stech.enums.AccountStatus;
import com.stech.enums.Role;
import com.stech.repository.AppSetupRepository;
import com.stech.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SetupService {

	private final AppSetupRepository appSetupRepository;

	private final UserRepository appUserRepository;

	private final PasswordEncoder passwordEncoder;

	@Transactional
	public void setup() {

		if (!appSetupRepository.findAll().isEmpty()) {
			throw new IllegalStateException("App is already setup");
		}

		setupRootUser();
		appSetupRepository.save(new AppSetup("SETUP DONE", new Date()));
	}

	private User setupRootUser() {

		User root = new User();
		root.setUserName("a");
		root.setPhoneNumber("01929986899");
		root.setEmail("srijontech@gmail.com");
		root.setAccountStatus(AccountStatus.ACTIVE);
		root.setPassword(passwordEncoder.encode("a"));

		Set<Role> roles = new HashSet<>();
		roles.add(Role.SYS_ROOT);
		root.setRoles(roles);
		return appUserRepository.save(root);
	}
}
