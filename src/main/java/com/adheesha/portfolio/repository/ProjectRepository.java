package com.adheesha.portfolio.repository;

import com.adheesha.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
