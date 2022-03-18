package com.ming.abstractservice.domain.person.entity;

import com.ming.abstractservice.domain.person.dto.request.PersonCreateRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Person {

    private final String name;

    private final String age;

    private final Gender gender;

    private final String favorate;

    public enum Gender {
        MALE,
        FEMALE
    }
}
