package com.ming.abstractservice.domain.car.service;

import com.ming.abstractservice.domain.car.dto.request.CarCreateRequest;
import com.ming.abstractservice.domain.car.dto.response.CarCreateResponse;
import com.ming.abstractservice.domain.car.entity.Car;
import com.ming.abstractservice.domain.car.internal.CarClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CarService {

    private final CarClient client;

    public CarCreateResponse create(CarCreateRequest request) {

        Car car = client.createNewCar();

        return CarCreateResponse.builder()
                .carId(car.getId())
                .carName(car.getName())
                .build();
    }
}
