package com.stech.utils;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Objects;

public class WebUtils {

	public static String getBackLink() {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		return ServletRequestUtils.getStringParameter(request, "backLink", "/dashboard");
	}

	public static HttpServletRequest getCurrentRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
	}

	public static void retainFlashMapAttributes(HttpServletRequest request) {
		
		Map<String, ?> lastAttributes = RequestContextUtils.getInputFlashMap(request); // should hold the attributes
																						// from your last request
		FlashMap forNextRequest = RequestContextUtils.getOutputFlashMap(request); // will hold the attributes for your
																					// next request
		if (Objects.nonNull(lastAttributes)) {
			forNextRequest.putAll(lastAttributes);
		}
	}
}
