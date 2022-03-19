package com.ming.abstractservice.domain.car.dto.response;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class CarCreateResponse {

    private final long carId;

    private final String carName;
}
