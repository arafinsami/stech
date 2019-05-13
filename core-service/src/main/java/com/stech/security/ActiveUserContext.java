package com.stech.security;

import static com.stech.enums.UserCategory.SERVICE_PROVIDER_COMPANY;
import static com.stech.enums.UserCategory.SERVICE_PROVIDER_INDIVIDUAL;
import static com.stech.enums.UserCategory.SERVICE_SEEKER_COMPANY;
import static com.stech.enums.UserCategory.SERVICE_SEEKER_INDIVIDUAL;

import java.util.List;
import java.util.Set;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.stech.entity.User;
import com.stech.enums.Role;
import com.stech.enums.UserCategory;
import com.stech.model.AuthenticatedUser;
import com.stech.model.GlobalActionView;
import com.stech.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class ActiveUserContext {

	private final UserRepository userRepository;

	public User getLoggedInUser() {
		return userRepository.findById(getAuthenticationUser().getLoggedInAppUserId()).orElse(null);
	}

	public AuthenticatedUser getAuthenticationUser() {
		return (AuthenticatedUser) getUserAuthentication().getPrincipal();
	}

	public Authentication getUserAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}

	public Set<Role> getCurrentUserRoles() {
		return getLoggedInUser().getRoles();
	}

	public boolean isAuthenticated() {
		Authentication authentication = getUserAuthentication();
		return !(authentication instanceof AnonymousAuthenticationToken) && authentication.isAuthenticated();
	}

	public GlobalActionView getGlobalActionView() {
		return getAuthenticationUser().getGlobalActionView();
	}

	public boolean hasAnyRole(List<Role> roles) {
		return getCurrentUserRoles().stream().anyMatch(roles::contains);
	}

	public UserCategory getActiveUserCategory() {
		return getLoggedInUser().getUserCategory();
	}

	public boolean isServiceSeekerCompanyLoggedIn() {
		return getActiveUserCategory() == SERVICE_SEEKER_COMPANY;
	}

	public boolean isServiceSeekerIndividualLoggedIn() {
		return getActiveUserCategory() == SERVICE_SEEKER_INDIVIDUAL;
	}

	public boolean isServiceProviderCompanyLoggedIn() {
		return getActiveUserCategory() == SERVICE_PROVIDER_COMPANY;
	}

	public boolean isServiceProviderIndividualLoggedIn() {
		return getActiveUserCategory() == SERVICE_PROVIDER_INDIVIDUAL;
	}
}
