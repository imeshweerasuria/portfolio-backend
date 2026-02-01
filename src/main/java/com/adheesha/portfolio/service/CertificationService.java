package com.adheesha.portfolio.service;

import com.adheesha.portfolio.dto.CertificationDTO;
import com.adheesha.portfolio.repository.CertificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CertificationService {
    private final CertificationRepository repo;

    public List<CertificationDTO> getAll() {
        return repo.findAll().stream()
                .sorted(Comparator.comparing(c -> c.getOrderIndex() == null ? 999 : c.getOrderIndex()))
                .map(c -> new CertificationDTO(
                        c.getTitle(),
                        c.getIssuer(),
                        c.getIssueDate(),
                        c.getCredentialUrl(),
                        c.getCredentialId(),
                        c.getDescription(),
                        c.getOrderIndex()
                ))
                .toList();
    }
}
