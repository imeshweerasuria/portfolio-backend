package com.adheesha.portfolio.controller;

import com.adheesha.portfolio.dto.SkillDTO;
import com.adheesha.portfolio.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
@RequiredArgsConstructor
@CrossOrigin("*")
public class SkillController {

    private final SkillService service;

    @GetMapping
    public List<SkillDTO> getSkills() {
        return service.getAll();
    }
}
