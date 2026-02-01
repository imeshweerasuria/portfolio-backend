package com.adheesha.portfolio.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CertificationDTO {
    private String title;
    private String issuer;
    private String issueDate;
    private String credentialUrl;
    private String credentialId;
    private String description;
    private Integer orderIndex;
}
