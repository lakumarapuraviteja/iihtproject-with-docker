package com.cognizant.searchmicroservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.searchmicroservice.entity.Mentor_Skills;
import com.cognizant.searchmicroservice.entity.Skill;
import com.cognizant.searchmicroservice.service.SearchService;

@RestController
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@PostMapping("/mentorBySkill")
	public List<Mentor_Skills> searchMentorBySkill(@RequestBody @Valid Skill skill){
		return searchService.searchMentorBySkill(skill);
	}

}
