package com.mouflon.lessonspringboot.contoller;

import com.mouflon.lessonspringboot.dto.request.CompanyRequest;
import com.mouflon.lessonspringboot.dto.response.CompanyResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.mouflon.lessonspringboot.service.CompanyService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService service;

    @PostMapping()
    public CompanyResponse create(@RequestBody @Valid CompanyRequest companyRequest) {
        return service.create(companyRequest);
    }

    @PutMapping("/update/{id}")
    public CompanyResponse update(@PathVariable Long id, @RequestBody CompanyRequest companyRequest) {
        return service.update(id, companyRequest);
    }

    @GetMapping("/get/{id}")
    public CompanyResponse getCompanyById(@PathVariable Long id) {
        return service.getCompanyById(id);
    }

    @DeleteMapping("/delete/{id}")
    public CompanyResponse deleteById(@PathVariable Long id) {
        return service.deleteCompanyById(id);
    }
}
