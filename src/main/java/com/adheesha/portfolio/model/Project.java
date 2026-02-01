package com.adheesha.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 4000)
    private String description;

    @Column(length = 1000)
    private String techStack;

    private String githubLink;

    // ✅ NEW (for professional cards)
    private String liveLink;     // optional
    private String category;     // e.g. Smart City, Enterprise
    private String status;       // Ongoing / Completed
    private String period;       // e.g. Aug 2025 – Nov 2025

    @Column(length = 4000)
    private String highlights;   // store as newline-separated bullets

    private Integer orderIndex;  // 1..5 (controls sorting)
}
