package com.cognizant.usersignupmicroservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.usersignupmicroservice.entity.User;

public interface RegistrationRepository extends JpaRepository<User, Long> {

	Optional<User> findByUserName(String userName);
}
