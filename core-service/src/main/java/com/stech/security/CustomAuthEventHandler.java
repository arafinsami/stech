package com.stech.security;

import static com.stech.constant.SecurityConstants.AUTH_COOKIE_NAME;
import static com.stech.enums.Role.SYS_SERVICE_SEEKER;
import static com.stech.enums.Role.SYS_SERVICE_PROVIDER;
import static com.stech.enums.Role.SYS_ROOT;
import static com.stech.utils.CollectionUtils.containsAny;
import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.Objects;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import com.stech.cache.CacheName;
import com.stech.cache.CacheUtils;
import com.stech.constant.SecurityConstants;
import com.stech.entity.User;
import com.stech.entity.UserActivityLog;
import com.stech.enums.ActivityAction;
import com.stech.enums.Role;
import com.stech.model.AuthenticatedUser;
import com.stech.model.GlobalActionView;
import com.stech.repository.UserRepository;
import com.stech.repository.mongo.UserActivityLogRepository;
import com.stech.service.UserActivityLogService;
import com.stech.utils.CookieUtils;

@Component
public class CustomAuthEventHandler
		implements AuthenticationSuccessHandler, LogoutSuccessHandler, AuthenticationFailureHandler {

	private TokenService tokenService;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserActivityLogRepository userActivityLogRepository;

	@Autowired
	private ActiveUserContext activeUserContext;

	@Autowired
	private UserActivityLogService userActivityLogService;

	@Autowired
	public CustomAuthEventHandler(@Lazy TokenService tokenService) {

		this.tokenService = tokenService;
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException {

		String authId = tokenService.allocateToken(authentication.getName()).getKey();
		AuthenticatedUser authenticatedUser = (AuthenticatedUser) authentication.getPrincipal();
		authenticatedUser.setGlobalActionView(createGlobalActiveView(authenticatedUser.getUserRoles()));

		setLoggedInInfo(authenticatedUser);

		SecurityContextHolder.getContext().setAuthentication(authentication);
		CacheUtils.put(CacheName.AUTH_DATA, authId, SecurityContextHolder.getContext());
		CookieUtils.addCookie(response, AUTH_COOKIE_NAME, authId, -1);
		authenticatedUser.setAuthId(authId);
		setRemoteAddressWithLogin(authId);
		response.sendRedirect("/dashboard");
	}

	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException {

		AuthenticatedUser authenticatedUser = (AuthenticatedUser) authentication.getPrincipal();
		String authId = CookieUtils.getCookieValue(request, AUTH_COOKIE_NAME);

		deleteLoggedinInfo(authenticatedUser, authId);

		CookieUtils.removeCookie(response, AUTH_COOKIE_NAME);
		CacheUtils.remove(CacheName.AUTH_DATA, authId);

		request.getSession().invalidate();
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString("/auth/login");
		response.sendRedirect(builder.toUriString());
	}

	@Override
	public void onAuthenticationFailure(HttpServletRequest req, HttpServletResponse res,
			AuthenticationException exception) throws IOException, ServletException {

		if (exception instanceof DisabledException) {
			req.setAttribute(SecurityConstants.LOGIN_INACTIVE, true);
		}
		req.getRequestDispatcher("/auth/loginFailure").forward(req, res);
	}

	private GlobalActionView createGlobalActiveView(Set<Role> userRoles) {

		GlobalActionView globalActionView = new GlobalActionView();
		globalActionView.setRootUser(containsAny(userRoles, asList(SYS_ROOT)));
		globalActionView.setServiceSeeker(containsAny(userRoles, asList(SYS_SERVICE_SEEKER)));
		globalActionView.setServiceProvider(containsAny(userRoles, asList(SYS_SERVICE_PROVIDER)));
		return globalActionView;
	}

	private void setLoggedInInfo(AuthenticatedUser authUser) {

		String userName = authUser.getUsername();
		User user = userRepository.findByUserName(userName);
		if (Objects.nonNull(user)) {
			authUser.setLoggedInAppUserId(user.getId());
		}
	}

	private void deleteLoggedinInfo(AuthenticatedUser authUser, String authId) {

		String userName = authUser.getUsername();
		UserActivityLog userActivityLog = userActivityLogRepository.findByAuthIdAndUserName(authId, userName);
		userActivityLogRepository.delete(userActivityLog);
	}

	private void setRemoteAddressWithLogin(String authId) {

		User user = userRepository.findById(activeUserContext.getAuthenticationUser().getLoggedInAppUserId())
				.orElse(null);
		userActivityLogService.publishActivity(user, authId, ActivityAction.LOGIN);
	}
	
}




