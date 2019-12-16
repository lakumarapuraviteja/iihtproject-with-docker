package com.cognizant.usersignupmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserSignupMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSignupMicroServiceApplication.class, args);
	}

}
