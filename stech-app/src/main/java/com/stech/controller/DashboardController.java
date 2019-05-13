package com.stech.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.stech.security.SecurityChecker;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class DashboardController {

	private final SecurityChecker securityChecker;
	public static final String VIEW_DASHBOARD = "dashboard/dashboardIndex";
	public static final String VIEW_404 = "dashboard/404";

	@GetMapping("/dashboard")
	public String dashboard(Model model) {

		if (securityChecker.getUserIpBySession(SecurityContextHolder.getContext().getAuthentication().getName())
				.isEmpty()) {
			return "redirect:/";
		} else {
			return VIEW_DASHBOARD;
		}
	}
}
