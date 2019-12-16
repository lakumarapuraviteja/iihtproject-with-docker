package com.cognizant.searchmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SearchMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchMicroServiceApplication.class, args);
	}

}
