package com.cognizant.usermicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.usermicroservice.entity.User;
import com.cognizant.usermicroservice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public User getUserByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}
}
