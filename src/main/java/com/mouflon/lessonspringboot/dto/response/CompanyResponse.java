package com.mouflon.lessonspringboot.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CompanyResponse {

    private String id;
    private String companyName;
    private String address;
    private String email;
    private String number;
    private boolean blocked;
    private LocalDateTime createdAt;
}
