package com.ming.abstractservice.domain.company.service;

import com.ming.abstractservice.domain.company.dto.request.CompanyCreateRequest;
import com.ming.abstractservice.domain.company.dto.response.CompanyCreateResponse;
import com.ming.abstractservice.domain.company.entity.Company;
import com.ming.abstractservice.domain.company.internal.CompanyClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CompanyService {

    private final CompanyClient client;

    public CompanyCreateResponse create(CompanyCreateRequest request) {

        Company company = client.createNewCompany();
        return CompanyCreateResponse.builder()
                .companyId(company.getId())
                .companyName(company.getName())
                .build();
    }
}
