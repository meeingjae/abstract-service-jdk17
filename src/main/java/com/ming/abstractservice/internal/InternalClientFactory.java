package com.ming.abstractservice.internal;

import com.ming.abstractservice.domain.car.internal.CarClient;
import com.ming.abstractservice.domain.company.internal.CompanyClient;
import com.ming.abstractservice.domain.person.internal.PersonClient;
import lombok.Getter;

@Getter
public class InternalClientFactory {

    public CarClient     carClient;
    public CompanyClient companyClient;
    public PersonClient  personClient;
}
