package com.cognizant.usermicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.usermicroservice.entity.User;
import com.cognizant.usermicroservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/findUser/{userName}")
	public User getAllSkills(@PathVariable String userName) {
		return userService.getUserByUserName(userName);
	}
}
