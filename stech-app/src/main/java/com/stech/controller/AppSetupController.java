package com.stech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stech.service.SetupService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping(path = "setup")
public class AppSetupController {

	private final SetupService setupService;

	@GetMapping
	@ResponseBody
	public ResponseEntity<?> setup() {
		try {
			setupService.setup();
		} catch (Exception e) {
			return ResponseEntity.ok("ERROR. " + e.getMessage());
		}

		return ResponseEntity.ok("DONE");
	}
}