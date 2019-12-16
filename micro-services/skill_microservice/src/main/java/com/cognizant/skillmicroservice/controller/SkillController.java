package com.cognizant.skillmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.skillmicroservice.entity.Skill;
import com.cognizant.skillmicroservice.service.SkillService;

@RestController
public class SkillController {

	@Autowired
	private SkillService skillService;
	
	@GetMapping("/skills")
	public List<Skill> getAllSkills() {
		return skillService.getAllSkills();
	}
}
