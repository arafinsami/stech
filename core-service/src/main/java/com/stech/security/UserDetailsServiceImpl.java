package com.stech.security;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.stech.entity.User;
import com.stech.model.AuthenticatedUser;
import com.stech.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

	private final UserRepository appUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = appUserRepository.findByUserName(username);

		if (Objects.isNull(user)) {
			throw new UsernameNotFoundException("User with username '" + username + "' was not found!");
		}
		
		List<GrantedAuthority> grantedAuthorities = user.getRoles().stream()
				.map(r -> new SimpleGrantedAuthority(r.name())).collect(Collectors.toList());

		boolean accountStatus = user.isActive();
		AuthenticatedUser authUser = new AuthenticatedUser(user.getUserName(), user.getPassword(), grantedAuthorities,
				accountStatus);
		return authUser;
	}
}

