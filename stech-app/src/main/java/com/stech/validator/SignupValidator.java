package com.stech.validator;

import java.util.Objects;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.stech.command.SignupCommand;
import com.stech.entity.User;
import com.stech.repository.UserRepository;
import com.stech.utils.StringUtils;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SignupValidator implements Validator {

	private final UserRepository userRepository;

	@Override
	public boolean supports(Class<?> clazz) {
		return SignupCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		SignupCommand command = (SignupCommand) target;
		User user = command.getUser();
		
		if (user.isNew()) {

			checkUserName(user, errors);
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.password", "NotNull");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.confirmPassword", "NotNull");
			String password = command.getUser().getPassword();
			String confirmPassword = command.getUser().getConfirmPassword();
			if (StringUtils.isAllNotEmpty(confirmPassword, confirmPassword) && !password.equals(confirmPassword)) {
				errors.rejectValue("user.password", "error.password.mismatch");
			}
		}

	}

	public void checkUserName(User user, Errors errors) {

		User exitingUser = userRepository.findByUserName(user.getUserName());
		if (Objects.nonNull(exitingUser)) {
			errors.rejectValue("user.userName", "error.user.name.exists");
		}
	}

}
