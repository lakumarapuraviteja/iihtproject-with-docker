package com.cognizant.usersignupmicroservice.exception;

public class UserDoesNotExistException extends Exception {

	public UserDoesNotExistException(String message) {
		super(message);
	}
}
