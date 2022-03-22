package com.ming.abstractservice.dto.request.v3;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.ming.abstractservice.internal.InternalClientFactory;
import com.ming.abstractservice.internal.V3AbstractInternal;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static com.ming.abstractservice.domain.car.entity.Car.CarColor;
import static com.ming.abstractservice.domain.car.entity.Car.CarType;

@Getter
@JsonTypeName("CAR")
@RequiredArgsConstructor
public class V3CarCreateRequest extends V3CreateRequestDto {

    private final DtoType dtoType;

    private final String name;

    private final CarType type;

    private final String price;

    private final CarColor color;

    public V3AbstractInternal getClient(InternalClientFactory factory) {
        return factory.getCarClient();
    }
}
