package com.stech.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class GlobalActionView implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean isLoggedIn;

	private boolean rootUser;

	private boolean serviceSeeker;
	
	private boolean serviceProvider;
}
