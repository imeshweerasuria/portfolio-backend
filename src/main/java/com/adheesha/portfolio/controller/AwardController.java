package com.adheesha.portfolio.controller;

import com.adheesha.portfolio.dto.AwardDTO;
import com.adheesha.portfolio.service.AwardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/awards")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AwardController {

    private final AwardService service;

    @GetMapping
    public List<AwardDTO> getAll() {
        return service.getAll();
    }
}
