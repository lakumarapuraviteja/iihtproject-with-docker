package com.cognizant.searchmicroservice.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.searchmicroservice.entity.Mentor_Skills;
import com.cognizant.searchmicroservice.entity.Skill;
import com.cognizant.searchmicroservice.repository.MentorSkillRepository;

@Service
public class SearchService {

	
	@Autowired
	private MentorSkillRepository mentorSkillRepository;

	@Transactional
	public List<Mentor_Skills> searchMentorBySkill(@Valid Skill skill) {
		return mentorSkillRepository.findAllBySkill(skill);
	}

	
}
