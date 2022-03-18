package com.ming.abstractservice.domain.company.dto.request;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CompanyCreateRequest {

    private final String name;

    private final String address;

    private final String ceoName;

    private final String sales;
}
