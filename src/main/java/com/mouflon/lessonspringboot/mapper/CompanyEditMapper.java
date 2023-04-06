package com.mouflon.lessonspringboot.mapper;

import com.mouflon.lessonspringboot.dto.request.CompanyRequest;
import com.mouflon.lessonspringboot.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyEditMapper {

    public Company create(CompanyRequest companyRequest) {
        if (companyRequest == null) {
            return null;
        }

        Company company = new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setNumber(companyRequest.getNumber());
        company.setEmail(companyRequest.getEmail());
        return company;
    }

    public void update(Company company, CompanyRequest request) {
        company.setCompanyName(request.getCompanyName());
        company.setAddress(request.getAddress());
        company.setNumber(request.getNumber());
        company.setEmail(request.getEmail());
    }
}