package com.cognizant.skillmicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.skillmicroservice.entity.Skill;
import com.cognizant.skillmicroservice.repository.SkillRepository;

@Service
public class SkillService {

	@Autowired
	private SkillRepository skillRepository;
	
	@Transactional
	public List<Skill> getAllSkills() {
		return skillRepository.findAll();
	}
}
