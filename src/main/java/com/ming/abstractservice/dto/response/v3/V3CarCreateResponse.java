package com.ming.abstractservice.dto.response.v3;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class V3CarCreateResponse {

    private final long carId;

    private final String carName;
}
