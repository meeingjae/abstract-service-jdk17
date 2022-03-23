package com.ming.abstractservice.domain.car.internal;

import com.ming.abstractservice.domain.car.dto.request.CarCreateRequest;
import com.ming.abstractservice.domain.car.entity.Car;
import com.ming.abstractservice.dto.request.v3.V3CarCreateRequest;
import com.ming.abstractservice.dto.request.v3.V3CreateRequestDto;
import com.ming.abstractservice.entity.V3AbstractEntity;
import com.ming.abstractservice.internal.V3AbstractInternal;
import com.ming.abstractservice.util.IdGenerator;
import org.springframework.stereotype.Component;

@Component
public class CarClient implements V3AbstractInternal {

    public Car createNewCar(CarCreateRequest request) {

        return Car.builder()
                .id(IdGenerator.getNumberId())
                .type(request.getType())
                .color(request.getColor())
                .name(request.getName())
                .price(request.getPrice())
                .build();
    }

    public Car v3CreateNewCar(V3CarCreateRequest request) {

        return Car.builder()
                .id(IdGenerator.getNumberId())
                .type(request.getType())
                .color(request.getColor())
                .name(request.getName())
                .price(request.getPrice())
                .build();
    }

    @Override
    public V3AbstractEntity createEntity(V3CreateRequestDto requestDto) {

        return v3CreateNewCar((V3CarCreateRequest) requestDto);
    }
}
