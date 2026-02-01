package com.adheesha.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "certification")
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;          // "AI/ML Engineer – Stage 1"

    @Column(nullable = false)
    private String issuer;         // "SLIIT"

    private String issueDate;      // "Jan 2026"
    private String credentialUrl;  // optional
    private String credentialId;   // optional

    @Column(length = 2000)
    private String description;    // optional

    private Integer orderIndex;
}
