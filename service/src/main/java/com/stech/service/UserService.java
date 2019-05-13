package com.stech.service;

import javax.transaction.Transactional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.stech.entity.User;
import com.stech.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final JdbcTemplate jdbcTemplate;
	private final UserRepository userRepository;

	@Transactional
	public void changePassword(Long id, String password) {
		String SQL = "update user set password = ? where id = ?";
		jdbcTemplate.update(SQL, password, id);
	}
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow();
	}

}
