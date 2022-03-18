package com.ming.abstractservice.domain.person.dto.request;

import lombok.RequiredArgsConstructor;

import static com.ming.abstractservice.domain.person.entity.Person.Gender;

@RequiredArgsConstructor
public class PersonCreateRequest {

    private final String name;

    private final String age;

    private final Gender gender;

    private final String favorate;

}
