package com.ming.abstractservice.domain.person.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Person {

    private final long id;

    private final String name;

    private final int age;

    private final Gender gender;

    private final String favorate;


    public enum Gender {
        MALE,
        FEMALE
    }
}
