package com.cognizant.userloginmicroservice.exception;

public class UserAlreadyExistsException extends Exception {

	public UserAlreadyExistsException(String message) {
		super(message);
	}
}
