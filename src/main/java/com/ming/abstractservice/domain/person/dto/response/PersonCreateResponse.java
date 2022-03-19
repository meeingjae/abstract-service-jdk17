package com.ming.abstractservice.domain.person.dto.response;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class PersonCreateResponse {

    private final long personId;

    private final String name;
}
