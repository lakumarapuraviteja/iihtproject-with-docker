package com.cognizant.searchmicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.searchmicroservice.entity.Mentor_Skills;
import com.cognizant.searchmicroservice.entity.Skill;

public interface MentorSkillRepository extends JpaRepository<Mentor_Skills, Long> {
	
	List<Mentor_Skills> findAllBySkill(Skill skill);

}
