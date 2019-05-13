package com.stech.helper;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.stech.command.SignupCommand;
import com.stech.entity.User;
import com.stech.enums.UserCategory;
import com.stech.repository.SubIndustryCommonDataRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SignupHelper {

	private final SubIndustryCommonDataRepository industryCommonDataRepository;

	public SignupCommand signUp() {
		User user = new User();
		return new SignupCommand(user, null);
	}

	public void getSignUpData(Model model) {
		model.addAttribute("industries", industryCommonDataRepository.findAll());
		model.addAttribute("userCategories", UserCategory.values());
	}

}
