package com.ming.abstractservice.domain.car.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static com.ming.abstractservice.domain.car.entity.Car.CarColor;
import static com.ming.abstractservice.domain.car.entity.Car.CarType;

@Getter
@Builder
@RequiredArgsConstructor
public class CarCreateRequest {

    private final String name;

    private final CarType type;

    private final String price;

    private final CarColor color;

}
