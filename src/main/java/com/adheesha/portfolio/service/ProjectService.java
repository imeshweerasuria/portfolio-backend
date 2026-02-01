package com.adheesha.portfolio.service;

import com.adheesha.portfolio.dto.ProjectDTO;
import com.adheesha.portfolio.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository repository;

    public List<ProjectDTO> getAll() {
        return repository.findAll()
                .stream()
                .sorted(Comparator.comparing(p -> p.getOrderIndex() == null ? 999 : p.getOrderIndex()))
                .map(p -> new ProjectDTO(
                        p.getTitle(),
                        p.getDescription(),
                        p.getTechStack(),
                        p.getGithubLink(),
                        p.getLiveLink(),
                        p.getCategory(),
                        p.getStatus(),
                        p.getPeriod(),
                        p.getHighlights(),
                        p.getOrderIndex()
                ))
                .toList();
    }
}
