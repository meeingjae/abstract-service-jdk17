package com.ming.abstractservice.domain.car.internal;

import com.ming.abstractservice.domain.car.dto.request.CarCreateRequest;
import com.ming.abstractservice.domain.car.entity.Car;
import com.ming.abstractservice.entity.V3AbstractEntity;
import com.ming.abstractservice.internal.V3AbstractInternal;
import com.ming.abstractservice.util.IdGenerator;
import org.springframework.stereotype.Repository;

@Repository
public interface CarClient extends V3AbstractInternal {

    Car createCar();

    default Car createNewCar() {

        return Car.builder()
                .id(IdGenerator.getNumberId())
                .color(Car.CarColor.BLUE)
                .type(Car.CarType.BMW)
                .name("pabien")
                .price("57000000")
                .build();
    }

    default Car createNewCar(CarCreateRequest request) {

        return Car.builder()
                .id(IdGenerator.getNumberId())
                .type(request.getType())
                .color(request.getColor())
                .name(request.getName())
                .price(request.getPrice())
                .build();
    }

    @Override
    default V3AbstractEntity createEntity() {

        return createNewCar();
    }
}
