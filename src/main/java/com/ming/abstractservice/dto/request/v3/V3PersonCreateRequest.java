package com.ming.abstractservice.dto.request.v3;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.ming.abstractservice.internal.InternalClientFactory;
import com.ming.abstractservice.internal.V3AbstractInternal;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static com.ming.abstractservice.domain.person.entity.Person.Gender;

@Builder
@Getter
@JsonTypeName("PERSON")
@RequiredArgsConstructor
public class V3PersonCreateRequest extends V3CreateRequestDto {

    private final DtoType dtoType;

    private final String name;

    private final int age;

    private final Gender gender;

    private final String favorate;

    @Override
    public V3AbstractInternal getClient(InternalClientFactory factory) {

        return factory.getPersonClient();
    }
}
