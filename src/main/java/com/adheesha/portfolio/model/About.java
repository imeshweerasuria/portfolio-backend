package com.adheesha.portfolio.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class About {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 1000)
    private String description;

    private String role; // Software Engineering Intern
}
