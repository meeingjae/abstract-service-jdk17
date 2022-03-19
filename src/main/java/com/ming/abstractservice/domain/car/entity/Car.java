package com.ming.abstractservice.domain.car.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Car {

    private final long id;

    private final String name;

    private final CarType type;

    private final String price;

    private final CarColor color;


    public enum CarType {
        BMW,
        KIA,
        HYUNDAI
    }


    public enum CarColor {
        BLUE,
        BLACK,
        WHITE
    }
}
