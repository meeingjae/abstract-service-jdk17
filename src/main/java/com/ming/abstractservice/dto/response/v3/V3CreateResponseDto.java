package com.ming.abstractservice.dto.response.v3;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder(toBuilder = true)
@RequiredArgsConstructor
public class V3CreateResponseDto {

    private final long id;

    private final String name;
}
