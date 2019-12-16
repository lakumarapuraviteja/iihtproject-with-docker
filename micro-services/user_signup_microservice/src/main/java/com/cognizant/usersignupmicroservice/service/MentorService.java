package com.cognizant.usersignupmicroservice.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.usersignupmicroservice.entity.Mentor;
import com.cognizant.usersignupmicroservice.entity.Mentor_Skills;
import com.cognizant.usersignupmicroservice.entity.User;
import com.cognizant.usersignupmicroservice.exception.LinkedInURLAlreadyExistsException;
import com.cognizant.usersignupmicroservice.exception.MentorSkillAlreadyExistsException;
import com.cognizant.usersignupmicroservice.repository.MentorRepository;
import com.cognizant.usersignupmicroservice.repository.MentorSkillRepository;
import com.cognizant.usersignupmicroservice.repository.RegistrationRepository;

@Service
public class MentorService {

	@Autowired
	private MentorRepository mentorRepository;
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Autowired
	private MentorSkillRepository mentorSkillRepository;

	@Transactional
	public void addMentor(@Valid Mentor mentor) throws LinkedInURLAlreadyExistsException {
		User user = registrationRepository.findByUserName(mentor.getUser().getUserName()).get();
		mentor.setUser(user);
		if(mentorRepository.findByLinkedinURL(mentor.getLinkedinURL()).isPresent()){
			throw new LinkedInURLAlreadyExistsException("This LinkedIn URL is already being used");
		}
		mentorRepository.save(mentor);
	}
	
	@Transactional
	public void addMentorSkill(@Valid Mentor_Skills mentorSkill) throws MentorSkillAlreadyExistsException {
		Mentor mentor = mentorRepository.findByLinkedinURL(mentorSkill.getMentor().getLinkedinURL()).get();
		mentorSkill.setMentor(mentor);
		List<Mentor_Skills> mentorExistingSkills = mentorSkillRepository.findAllByMentor(mentor);
		for(Mentor_Skills mentorExistingSkill:mentorExistingSkills){
			if(mentorExistingSkill.getSkill().getName().matches(mentorSkill.getSkill().getName())){
				throw new MentorSkillAlreadyExistsException("This skill exists for this mentor");
			}
		}
		mentorSkillRepository.save(mentorSkill);
	}

}
