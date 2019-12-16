package com.cognizant.skillmicroservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SkillMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillMicroServiceApplication.class, args);
	}

}
