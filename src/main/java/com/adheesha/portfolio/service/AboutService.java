package com.adheesha.portfolio.service;

import com.adheesha.portfolio.dto.AboutDTO;
import com.adheesha.portfolio.model.About;
import com.adheesha.portfolio.repository.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AboutService {

    private final AboutRepository repository;

    public AboutDTO getAbout() {
        About about = repository.findAll().stream().findFirst().orElse(null);
        if (about == null) return null;

        return new AboutDTO(
                about.getDescription(),
                about.getRole()
        );
    }
}
