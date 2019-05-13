package com.stech.controller;

import static com.stech.constant.SecurityConstants.LOGIN_STATUS;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.stech.model.Login;
import com.stech.security.ActiveUserContext;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class LoginController {

	private final ActiveUserContext activeUserContext;
	private static final String VIEW_LOGIN = "front/login";

	@GetMapping("/auth/login")
	public String login(@ModelAttribute(LOGIN_STATUS) Login login, Model model) {

		if (activeUserContext.isAuthenticated()) {
			return "redirect:/dashboard";
		}
		return VIEW_LOGIN;
	}
}
