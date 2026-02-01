package com.adheesha.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "award")
public class Award {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;     // "Content Creator & Educator – YouTube ..."

    private String org;       // "YouTube"
    private String nameTag;   // "(Imesh Weerasuria)" or "Local Dhamma School"
    private String period;    // optional (if you want later)

    @Column(length = 2000)
    private String description;

    private Integer orderIndex;
}
