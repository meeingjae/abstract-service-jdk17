package com.ming.abstractservice.internal;

import com.ming.abstractservice.domain.car.internal.CarClient;
import com.ming.abstractservice.domain.company.internal.CompanyClient;
import com.ming.abstractservice.domain.person.internal.PersonClient;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class InternalClientFactory {

    private final CarClient     carClient;
    private final CompanyClient companyClient;
    private final PersonClient  personClient;
}
