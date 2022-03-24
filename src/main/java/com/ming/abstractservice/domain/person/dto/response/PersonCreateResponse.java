package com.ming.abstractservice.domain.person.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class PersonCreateResponse {

    private final long personId;

    private final String personName;
}
