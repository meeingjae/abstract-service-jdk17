package com.ming.abstractservice.domain.car.internal;

import com.ming.abstractservice.domain.car.entity.Car;
import org.springframework.stereotype.Repository;

@Repository
public interface CarClient {

    Car createCar();
}
