package com.stech.security;

import static com.stech.constant.SecurityConstants.AUTH_COOKIE_NAME;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpRequestResponseHolder;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.stereotype.Component;

import com.stech.cache.CacheName;
import com.stech.cache.CacheUtils;
import com.stech.utils.CookieUtils;

@Component
public class CacheSecurityContextRepository implements SecurityContextRepository {

	@Override
	public SecurityContext loadContext(HttpRequestResponseHolder requestResponseHolder) {
		String authId = CookieUtils.getCookieValue(requestResponseHolder.getRequest(), AUTH_COOKIE_NAME);
		SecurityContext securityContext = null;

		if (authId != null) {
			securityContext = CacheUtils.get(CacheName.AUTH_DATA, authId);
		}

		return securityContext != null ? securityContext : SecurityContextHolder.createEmptyContext();
	}

	@Override
	public void saveContext(SecurityContext context, HttpServletRequest req, HttpServletResponse res) {
		Authentication authentication = context.getAuthentication();
		String authId = CookieUtils.getCookieValue(req, AUTH_COOKIE_NAME);

		if (authId != null && authentication != null) {
			CacheUtils.put(CacheName.AUTH_DATA, authId, context);
		}
	}

	@Override
	public boolean containsContext(HttpServletRequest req) {
		String authId = CookieUtils.getCookieValue(req, AUTH_COOKIE_NAME);
		return authId != null && CacheUtils.get(CacheName.AUTH_DATA, authId) != null;
	}
}
