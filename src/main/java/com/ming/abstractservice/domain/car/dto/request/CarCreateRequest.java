package com.ming.abstractservice.domain.car.dto.request;

import lombok.RequiredArgsConstructor;

import static com.ming.abstractservice.domain.car.entity.Car.CarColor;
import static com.ming.abstractservice.domain.car.entity.Car.CarType;

@RequiredArgsConstructor
public class CarCreateRequest {

    private final String name;

    private final CarType type;

    private final String price;

    private final CarColor color;

}
