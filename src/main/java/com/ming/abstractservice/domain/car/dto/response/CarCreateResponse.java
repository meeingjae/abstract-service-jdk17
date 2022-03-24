package com.ming.abstractservice.domain.car.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class CarCreateResponse {

    private final long carId;

    private final String carName;
}
