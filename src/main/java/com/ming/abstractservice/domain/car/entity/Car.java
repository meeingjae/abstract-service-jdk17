package com.ming.abstractservice.domain.car.entity;

import com.ming.abstractservice.dto.response.v3.V3CreateResponseDto;
import com.ming.abstractservice.entity.V3AbstractEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Car extends V3AbstractEntity {

    private final long id;

    private final String name;

    private final CarType type;

    private final String price;

    private final CarColor color;

    public V3CreateResponseDto mapToDto() {

        return V3CreateResponseDto.builder()
                .id(this.getId())
                .name(this.getName())
                .build();
    }

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
