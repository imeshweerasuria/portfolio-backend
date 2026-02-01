package com.adheesha.portfolio.controller;

import com.adheesha.portfolio.dto.ProjectDTO;
import com.adheesha.portfolio.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProjectController {

    private final ProjectService service;

    @GetMapping
    public List<ProjectDTO> getProjects() {
        return service.getAll();
    }
}
