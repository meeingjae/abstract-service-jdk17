package com.ming.abstractservice.service;

import com.ming.abstractservice.domain.car.entity.Car;
import com.ming.abstractservice.domain.car.internal.CarClient;
import com.ming.abstractservice.domain.company.entity.Company;
import com.ming.abstractservice.domain.company.internal.CompanyClient;
import com.ming.abstractservice.domain.person.entity.Person;
import com.ming.abstractservice.domain.person.internal.PersonClient;
import com.ming.abstractservice.dto.request.v2.V2CreateRequestDto;
import com.ming.abstractservice.dto.response.v2.V2CreateResponseDto;
import org.springframework.stereotype.Service;

@Service
public class V2Service {

    public CarClient     carClient;
    public CompanyClient companyClient;
    public PersonClient  personClient;

    public V2CreateResponseDto createV2(V2CreateRequestDto request) {

        V2CreateResponseDto.V2CreateResponseDtoBuilder response = V2CreateResponseDto.builder();

        if (request.getCar() != null) {
            Car car = carClient.createNewCar(request.getCar());
            return response.id(car.getId()).name(car.getName()).build();
        } else if (request.getCompany() != null) {
            Company company = companyClient.createNewCompany(request.getCompany());
            return response.id(company.getId()).name(company.getName()).build();
        } else {
            Person person = personClient.createNewPerson(request.getPerson());
            return response.id(person.getId()).name(person.getName()).build();
        }
    }
}
