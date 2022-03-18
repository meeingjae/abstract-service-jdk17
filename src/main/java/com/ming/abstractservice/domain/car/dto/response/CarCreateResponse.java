package com.ming.abstractservice.domain.car.dto.response;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarCreateResponse {

    private final long carId;

    private final String carName;
}
