package com.ming.abstractservice.domain.company.entity;

import com.ming.abstractservice.dto.response.v3.V3CreateResponseDto;
import com.ming.abstractservice.entity.V3AbstractEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Company extends V3AbstractEntity {

    private final long id;

    private final String name;

    private final String address;

    private final String ceoName;

    private final String sales;

    @Override
    public V3CreateResponseDto mapToDto() {

        return V3CreateResponseDto.builder()
                .id(this.getId())
                .name(this.getName())
                .build();
    }
}
