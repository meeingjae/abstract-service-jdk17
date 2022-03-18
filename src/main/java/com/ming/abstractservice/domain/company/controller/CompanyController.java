package com.ming.abstractservice.domain.company.controller;

import com.ming.abstractservice.domain.company.dto.request.CompanyCreateRequest;
import com.ming.abstractservice.domain.company.dto.response.CompanyCreateResponse;
import com.ming.abstractservice.domain.company.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService service;

    @PostMapping
    public CompanyCreateResponse create(
            @RequestBody CompanyCreateRequest request) {

        return service.create(request);
    }
}
