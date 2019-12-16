package com.cognizant.usersignupmicroservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.usersignupmicroservice.entity.Mentor;
import com.cognizant.usersignupmicroservice.entity.Mentor_Skills;
import com.cognizant.usersignupmicroservice.entity.User;
import com.cognizant.usersignupmicroservice.exception.LinkedInURLAlreadyExistsException;
import com.cognizant.usersignupmicroservice.exception.MentorSkillAlreadyExistsException;
import com.cognizant.usersignupmicroservice.service.MentorService;

@RestController
public class MentorController {

	@Autowired
	private MentorService mentorService;
	
	@PostMapping("/addMentor")
	public void addMentor(@RequestBody @Valid Mentor mentor) throws LinkedInURLAlreadyExistsException{
		mentorService.addMentor(mentor);
	}
	
	@PostMapping("/addMentorSkill")
	public void addMentorSkill(@RequestBody @Valid Mentor_Skills mentorSkill) throws MentorSkillAlreadyExistsException {
		mentorService.addMentorSkill(mentorSkill);
	}
}
