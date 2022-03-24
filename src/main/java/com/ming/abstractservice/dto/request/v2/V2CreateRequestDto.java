package com.ming.abstractservice.dto.request.v2;

import com.ming.abstractservice.domain.car.dto.request.CarCreateRequest;
import com.ming.abstractservice.domain.company.dto.request.CompanyCreateRequest;
import com.ming.abstractservice.domain.person.dto.request.PersonCreateRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class V2CreateRequestDto {

    private final CarCreateRequest car;

    private final CompanyCreateRequest company;

    private final PersonCreateRequest person;
}
