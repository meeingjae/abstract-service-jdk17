package com.ming.abstractservice.dto.response.v3;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class V3CompanyCreateResponse {

    private final long companyId;

    private final String companyName;
}
