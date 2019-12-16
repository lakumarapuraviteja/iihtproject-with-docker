package com.cognizant.usersignupmicroservice.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cognizant.usersignupmicroservice.entity.User;
import com.cognizant.usersignupmicroservice.exception.UserAlreadyExistsException;
import com.cognizant.usersignupmicroservice.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	public void register(@Valid User newUser) throws UserAlreadyExistsException {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		newUser.setPassword(encoder.encode(newUser.getPassword()));
		Optional<User> result = registrationRepository.findByUserName(newUser.getUserName());
		if(result.isPresent()){
			throw new UserAlreadyExistsException("UserName is already in use");
		}
		else{
			registrationRepository.save(newUser);
		}
	}
}
