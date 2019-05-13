package com.stech.mail;

import org.springframework.mail.SimpleMailMessage;

import com.stech.entity.ConfirmationToken;
import com.stech.entity.User;

public class MailDto {

	public static SimpleMailMessage send(User user, ConfirmationToken confirmationToken) {

		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmail());
		mail.setFrom("srijontech@gmail.com");
		mail.setSubject("Complete Registration!");
		mail.setText("To confirm your account, please click here : " + "http://localhost:8181/confirm-account?token="
				+ confirmationToken.getConfirmationToken());
		return mail;
	}

	public static SimpleMailMessage send(User user,String password) {

		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmail());
		mail.setFrom("srijontech@gmail.com");
		mail.setSubject("Complete Registration!");
		mail.setText("Your New Password Is : " + password
				+ " Please Note That This Password is not secured,"
				+ "Please Login first using this password and change your password");
		return mail;
	}
}
