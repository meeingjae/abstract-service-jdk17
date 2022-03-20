package com.ming.abstractservice.domain.person.internal;

import com.ming.abstractservice.domain.person.entity.Person;
import com.ming.abstractservice.entity.V3AbstractEntity;
import com.ming.abstractservice.internal.V3AbstractInternal;
import com.ming.abstractservice.util.IdGenerator;

public interface PersonClient extends V3AbstractInternal {

    default Person createNewPerson() {

        return Person.builder()
                .id(IdGenerator.getNumberId())
                .name("minjae")
                .age(29)
                .gender(Person.Gender.MALE)
                .favorate("workout")
                .build();
    }

    @Override
    default V3AbstractEntity createEntity() {
        return createNewPerson();
    }
}
