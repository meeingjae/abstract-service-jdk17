package com.ming.abstractservice.domain.person.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static com.ming.abstractservice.domain.person.entity.Person.Gender;

@Builder
@Getter
@RequiredArgsConstructor
public class PersonCreateRequest {

    private final String name;

    private final int age;

    private final Gender gender;

    private final String favorate;

}
