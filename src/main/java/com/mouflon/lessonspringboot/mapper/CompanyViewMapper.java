package com.mouflon.lessonspringboot.mapper;

import com.mouflon.lessonspringboot.dto.response.CompanyResponse;
import com.mouflon.lessonspringboot.entity.Company;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyViewMapper {

    public CompanyResponse viewCompany(Company company) {
        if (company == null) {
            return null;
        }

        CompanyResponse companyResponse = new CompanyResponse();

        if (company.getId() != null) {
            companyResponse.setId(String.valueOf(company.getId()));
        }

        companyResponse.setCompanyName(company.getCompanyName());
        companyResponse.setAddress(company.getAddress());
        companyResponse.setEmail(company.getEmail());
        companyResponse.setBlocked(company.isBlocked());
        companyResponse.setCreatedAt(company.getCreatedAt());
        companyResponse.setNumber(company.getNumber());
        return companyResponse;
    }

    public List<CompanyResponse> viewCompany(List<Company> companies) {
        List<CompanyResponse> responses = new ArrayList<>();
        for (Company company : companies) {
            responses.add(viewCompany(company));
        }
        return responses;
    }
}
