package com.ming.abstractservice.dto.response.v3;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class V3PersonCreateResponse {

    private final long personId;

    private final String name;
}
