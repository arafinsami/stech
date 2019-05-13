package com.stech.utils;

import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Objects;

public class CookieUtils {

	private static String COOKIE_ENCODING_METHOD = "UTF-8";

	public static void addCookie(HttpServletResponse response, String name, String value, int cookieAge) {

		try {
			value = URLEncoder.encode(value, COOKIE_ENCODING_METHOD);
		} catch (UnsupportedEncodingException ex) {
			throw new RuntimeException("Error while encoding cookie value", ex);
		}

		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(cookieAge);
		cookie.setPath("/");

		response.addCookie(cookie);
	}

	public static void removeCookie(HttpServletResponse response, String name) {
		addCookie(response, name, "", 0);
	}

	public static String getCookieValue(HttpServletRequest request, String name) {
		Cookie cookie = WebUtils.getCookie(request, name);
		;
		if (Objects.isNull(cookie)) {
			return null;
		}

		String encodedVal = cookie.getValue();
		try {
			return URLDecoder.decode(encodedVal, COOKIE_ENCODING_METHOD);
		} catch (UnsupportedEncodingException ex) {
			throw new RuntimeException("Error while decoding cookie value", ex);
		}
	}
}
