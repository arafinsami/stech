package com.stech.model;


import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.stech.enums.Role;
import com.stech.enums.UserCategory;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AuthenticatedUser extends User {

	private static final long serialVersionUID = 1L;

	private GlobalActionView globalActionView;

	private String authId;

	private long loggedInAppUserId;
	
	private UserCategory userCategory;
	
	private long userId;

	public AuthenticatedUser(String username, String password, Collection<? extends GrantedAuthority> authorities,
			boolean active) {
		super(username, password, active, true, true, true, authorities);
	}

	public Set<Role> getUserRoles() {
		return getAuthorities().stream().map(a -> Role.valueOf(a.getAuthority())).collect(Collectors.toSet());
	}
}
