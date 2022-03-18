package com.ming.abstractservice.domain.company.dto.response;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CompanyCreateResponse {

    private final long companyId;

    private final String companyName;
}
