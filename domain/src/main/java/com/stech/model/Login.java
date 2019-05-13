package com.stech.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Login {

	private String username;

	private String password;

	private boolean inactive;

	public Login(String username, String password) {

		this.username = username;
		this.password = password;
	}
}
