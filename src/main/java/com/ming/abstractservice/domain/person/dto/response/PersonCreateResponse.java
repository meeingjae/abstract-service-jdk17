package com.ming.abstractservice.domain.person.dto.response;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonCreateResponse {

    private final long personId;

    private final String name;
}
