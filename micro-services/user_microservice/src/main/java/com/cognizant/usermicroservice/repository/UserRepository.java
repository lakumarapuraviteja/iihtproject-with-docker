package com.cognizant.usermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.usermicroservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

}
