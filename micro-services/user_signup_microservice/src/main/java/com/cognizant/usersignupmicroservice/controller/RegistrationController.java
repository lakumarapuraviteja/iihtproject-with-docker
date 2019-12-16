package com.cognizant.usersignupmicroservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.usersignupmicroservice.entity.User;
import com.cognizant.usersignupmicroservice.exception.UserAlreadyExistsException;
import com.cognizant.usersignupmicroservice.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@PostMapping("/register")
	public void register(@RequestBody @Valid User user) throws UserAlreadyExistsException{
		registrationService.register(user);
	}

}
