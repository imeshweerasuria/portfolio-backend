package com.adheesha.portfolio.service;

import com.adheesha.portfolio.dto.AwardDTO;
import com.adheesha.portfolio.repository.AwardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AwardService {
    private final AwardRepository repo;

    public List<AwardDTO> getAll() {
        return repo.findAll().stream()
                .sorted(Comparator.comparing(a -> a.getOrderIndex() == null ? 999 : a.getOrderIndex()))
                .map(a -> new AwardDTO(
                        a.getTitle(),
                        a.getOrg(),
                        a.getNameTag(),
                        a.getPeriod(),
                        a.getDescription(),
                        a.getOrderIndex()
                ))
                .toList();
    }
}
