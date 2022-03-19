package com.ming.abstractservice.domain.company.dto.response;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class CompanyCreateResponse {

    private final long companyId;

    private final String companyName;
}
