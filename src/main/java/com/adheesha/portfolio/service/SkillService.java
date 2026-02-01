package com.adheesha.portfolio.service;

import com.adheesha.portfolio.dto.SkillDTO;
import com.adheesha.portfolio.model.Skill;
import com.adheesha.portfolio.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository repository;

    public List<SkillDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(skill -> new SkillDTO(
                        skill.getName(),
                        skill.getLevel()
                ))
                .toList();
    }
}
