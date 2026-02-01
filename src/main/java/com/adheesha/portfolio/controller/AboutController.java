package com.adheesha.portfolio.controller;

import com.adheesha.portfolio.dto.AboutDTO;
import com.adheesha.portfolio.service.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/about")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AboutController {

    private final AboutService service;

    @GetMapping
    public AboutDTO getAbout() {
        return service.getAbout();
    }
}
