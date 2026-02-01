package com.adheesha.portfolio.controller;

import com.adheesha.portfolio.dto.CertificationDTO;
import com.adheesha.portfolio.service.CertificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certifications")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CertificationController {

    private final CertificationService service;

    @GetMapping
    public List<CertificationDTO> getAll() {
        return service.getAll();
    }
}
