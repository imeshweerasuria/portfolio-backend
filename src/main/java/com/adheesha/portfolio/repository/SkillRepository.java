package com.adheesha.portfolio.repository;

import com.adheesha.portfolio.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    boolean existsByName(String name);
    Optional<Skill> findByName(String name);
}
