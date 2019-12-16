package com.cognizant.usersignupmicroservice.repository;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.usersignupmicroservice.entity.Mentor;
import com.cognizant.usersignupmicroservice.entity.User;

public interface MentorRepository extends JpaRepository<Mentor, Long> {

	Optional<Mentor> findByLinkedinURL(String linkedinURL);

	Mentor findByUser(User user);

}
