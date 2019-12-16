package com.cognizant.usersignupmicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.usersignupmicroservice.entity.Mentor;
import com.cognizant.usersignupmicroservice.entity.Mentor_Skills;

public interface MentorSkillRepository extends JpaRepository<Mentor_Skills, Long> {
	
	List<Mentor_Skills> findAllByMentor(Mentor mentor);

}
