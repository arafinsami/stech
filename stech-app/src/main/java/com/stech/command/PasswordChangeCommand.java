package com.stech.command;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.stech.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordChangeCommand {

	@Valid
	private User user;

	@NotNull
	private String newPassword;

	@NotNull
	private String confirmPassword;

	public PasswordChangeCommand(User user) {
		this.user = user;
	}
}
