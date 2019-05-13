package com.stech.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.stech.command.PasswordChangeCommand;
import com.stech.utils.StringUtils;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PasswordChangeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return PasswordChangeCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		PasswordChangeCommand command = (PasswordChangeCommand) target;
		String newPassword = command.getNewPassword();
		String confirmPassword = command.getConfirmPassword();
		if (StringUtils.isAllNotEmpty(confirmPassword, newPassword) && !newPassword.equals(confirmPassword)) {
			errors.rejectValue("newPassword", "error.password.mismatch");
		}
	}

}
