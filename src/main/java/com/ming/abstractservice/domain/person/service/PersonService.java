package com.ming.abstractservice.domain.person.service;

import com.ming.abstractservice.domain.person.dto.request.PersonCreateRequest;
import com.ming.abstractservice.domain.person.dto.response.PersonCreateResponse;
import com.ming.abstractservice.domain.person.entity.Person;
import com.ming.abstractservice.domain.person.internal.PersonClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonClient client;

    public PersonCreateResponse create(PersonCreateRequest request) {

        Person person = client.createNewPerson(request);

        return PersonCreateResponse.builder()
                .personId(person.getId())
                .personName(person.getName())
                .build();
    }
}
