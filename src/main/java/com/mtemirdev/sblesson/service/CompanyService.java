package com.mtemirdev.sblesson.service;

import com.mtemirdev.sblesson.dto.request.CompanyRequest;
import com.mtemirdev.sblesson.dto.response.CompanyResponse;
import com.mtemirdev.sblesson.mapper.CompanyEditMapper;
import com.mtemirdev.sblesson.entity.Company;
import lombok.RequiredArgsConstructor;
import com.mtemirdev.sblesson.mapper.CompanyViewMapper;
import org.springframework.stereotype.Service;
import com.mtemirdev.sblesson.repository.CompanyRepository;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository repository;
    private final CompanyEditMapper editMapper;
    private final CompanyViewMapper viewMapper;

    public CompanyResponse create(CompanyRequest request) {
        return viewMapper.viewCompany(repository.save(editMapper.create(request)));
    }

     public CompanyResponse update(Long id,  CompanyRequest request) {
        Company company = repository.findById(id).get();
        editMapper.update(company, request);
        return viewMapper.viewCompany(repository.save(company));
    }

    public CompanyResponse getCompanyById(Long id) {
        return viewMapper.viewCompany(repository.findById(id).get());
    }

    public CompanyResponse deleteCompanyById(Long id) {
        Company company = repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewCompany(company);
    }
}