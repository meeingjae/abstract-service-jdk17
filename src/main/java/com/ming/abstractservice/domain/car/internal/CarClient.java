package com.ming.abstractservice.domain.car.internal;

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
                .name("pabien")
                .price("57000000")
                .build();
    }

    @Override
    default V3AbstractEntity createEntity() {
        return createNewCar();
    }
}
