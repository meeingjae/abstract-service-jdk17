package com.ming.abstractservice.dto.response.v2;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder(toBuilder = true)
@RequiredArgsConstructor
public class V2CreateResponseDto {

    private final long id;

    private final String name;
}
