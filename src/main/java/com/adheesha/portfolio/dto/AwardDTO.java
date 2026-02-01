package com.adheesha.portfolio.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AwardDTO {
    private String title;
    private String org;
    private String nameTag;
    private String period;
    private String description;
    private Integer orderIndex;
}
