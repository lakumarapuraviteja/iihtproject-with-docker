package com.cognizant.skillmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.skillmicroservice.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}
