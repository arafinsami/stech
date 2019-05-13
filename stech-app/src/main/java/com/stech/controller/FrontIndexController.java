package com.stech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontIndexController {

	public static final String VIEW_FRONT = "front/index";

	@GetMapping(value = { "/", "http://localhost:8181" })
	public String index() {
		return "redirect:/index";
	}

	@GetMapping("/index")
	public String front() {
		return VIEW_FRONT;
	}

}
