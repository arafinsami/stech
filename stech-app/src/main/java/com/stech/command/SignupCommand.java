package com.stech.command;

import java.io.Serializable;
import java.util.Set;

import javax.validation.Valid;

import com.stech.entity.User;
import com.stech.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupCommand implements Serializable {

	private static final long serialVersionUID = 1L;

	@Valid
	private User user;

	private Set<Role> role;
}
