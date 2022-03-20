package com.ming.abstractservice.domain.person.entity;

import com.ming.abstractservice.dto.response.v3.V3CreateResponseDto;
import com.ming.abstractservice.entity.V3AbstractEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Person extends V3AbstractEntity {

    private final long id;

    private final String name;

    private final int age;

    private final Gender gender;

    private final String favorate;

    @Override
    public V3CreateResponseDto mapToDto() {

        return V3CreateResponseDto.builder()
                .id(this.getId())
                .name(this.getName())
                .build();
    }

    public enum Gender {
        MALE,
        FEMALE
    }
}
