package com.stech.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@Component
@Order(4)
public class ResourceCacheFilter implements Filter {

	private final String RESOURCE_PATH_PATTERN = "/assets/";

	private final String[] RESOURCE_EXTENSIONS = { ".js", ".css" };

	private final int DEFAULT_MAX_AGE = 30 * 24 * 60 * 60; // 30 days

	private String cacheHeaderValue;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		cacheHeaderValue = "max-age=" + DEFAULT_MAX_AGE;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;

		String requestUri = servletRequest.getRequestURI();
		if (requestUri.startsWith(RESOURCE_PATH_PATTERN)
				|| Arrays.stream(RESOURCE_EXTENSIONS).anyMatch(requestUri::endsWith)) {
			servletResponse.addHeader("Cache-Control", cacheHeaderValue);
		}

		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}
}
