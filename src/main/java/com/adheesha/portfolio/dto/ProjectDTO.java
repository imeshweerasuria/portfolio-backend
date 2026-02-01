package com.adheesha.portfolio.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {
    private String title;
    private String description;
    private String techStack;
    private String githubLink;

    // ✅ NEW
    private String liveLink;
    private String category;
    private String status;
    private String period;
    private String highlights;
    private Integer orderIndex;
}
