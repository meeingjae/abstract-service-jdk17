package com.ming.abstractservice.domain.person.internal;

import com.ming.abstractservice.domain.person.entity.Person;
import com.ming.abstractservice.util.IdGenerator;

public interface PersonClient {

    default Person createNewPerson() {

        return Person.builder()
                .id(IdGenerator.getNumberId())
                .name("minjae")
                .age(29)
                .gender(Person.Gender.MALE)
                .favorate("workout")
                .build();
    }
}
