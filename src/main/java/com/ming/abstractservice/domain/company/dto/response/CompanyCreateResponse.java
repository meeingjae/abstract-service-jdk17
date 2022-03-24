package com.ming.abstractservice.domain.company.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class CompanyCreateResponse {

    private final long companyId;

    private final String companyName;
}
