package com.ming.abstractservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ming.abstractservice.controller.AbstractController;
import com.ming.abstractservice.domain.car.controller.CarController;
import com.ming.abstractservice.domain.car.dto.request.CarCreateRequest;
import com.ming.abstractservice.domain.car.entity.Car;
import com.ming.abstractservice.domain.car.service.CarService;
import com.ming.abstractservice.domain.company.controller.CompanyController;
import com.ming.abstractservice.domain.company.dto.request.CompanyCreateRequest;
import com.ming.abstractservice.domain.company.service.CompanyService;
import com.ming.abstractservice.domain.person.controller.PersonController;
import com.ming.abstractservice.domain.person.dto.request.PersonCreateRequest;
import com.ming.abstractservice.domain.person.entity.Person;
import com.ming.abstractservice.domain.person.service.PersonService;
import com.ming.abstractservice.dto.request.v2.V2CreateRequestDto;
import com.ming.abstractservice.dto.request.v3.V3CarCreateRequest;
import com.ming.abstractservice.dto.request.v3.V3CompanyCreateRequest;
import com.ming.abstractservice.dto.request.v3.V3PersonCreateRequest;
import com.ming.abstractservice.service.V2Service;
import com.ming.abstractservice.service.V3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;


import static com.ming.abstractservice.domain.car.entity.Car.CarType.BMW;
import static com.ming.abstractservice.domain.car.entity.Car.CarColor.BLUE;
import static com.ming.abstractservice.domain.person.entity.Person.Gender.MALE;
import static com.ming.abstractservice.dto.request.v3.V3CreateRequestDto.DtoType.CAR;
import static com.ming.abstractservice.dto.request.v3.V3CreateRequestDto.DtoType.COMPANY;
import static com.ming.abstractservice.dto.request.v3.V3CreateRequestDto.DtoType.PERSON;

@ComponentScan
@AutoConfigureMockMvc
@SpringBootTest
public class TestBase {

    @Autowired
    public MockMvc mockMvc;

    @Autowired
    public ObjectMapper objectMapper;

    @Autowired
    public CarController carController;

    @Autowired
    public CompanyController companyController;

    @Autowired
    public PersonController personController;

    @Autowired
    public CarService carService;

    @Autowired
    public CompanyService companyService;

    @Autowired
    public PersonService personService;

    @Autowired
    public AbstractController abstractController;

    @Autowired
    public V2Service v2Service;

    @Autowired
    public V3Service v3Service;

    public V2CreateRequestDto makeV2Request() {

        return V2CreateRequestDto.builder()
                .car(makeCarRequest())
                .company(makeCompanyRequest())
                .person(makePersonRequest())
                .build();
    }

    public V2CreateRequestDto makeV2Request(CarCreateRequest carCreateRequest) {

        return V2CreateRequestDto.builder()
                .car(carCreateRequest)
                .build();
    }

    public V2CreateRequestDto makeV2Request(CompanyCreateRequest companyCreateRequest) {

        return V2CreateRequestDto.builder()
                .company(companyCreateRequest)
                .build();
    }

    public V2CreateRequestDto makeV2Request(PersonCreateRequest personCreateRequest) {

        return V2CreateRequestDto.builder()
                .person(personCreateRequest)
                .build();
    }

    public CarCreateRequest makeCarRequest() {

        return CarCreateRequest.builder().name("test name")
                .color(BLUE)
                .price("9999")
                .type(BMW)
                .build();
    }

    public CompanyCreateRequest makeCompanyRequest() {

        return CompanyCreateRequest.builder()
                .name("test name")
                .address("test address")
                .ceoName("test ceo")
                .sales("999999999")
                .build();
    }

    public PersonCreateRequest makePersonRequest() {

        return PersonCreateRequest.builder()
                .name("test name")
                .age(29)
                .favorate("favorate")
                .gender(MALE)
                .build();
    }

    public V3CarCreateRequest makeV3CarRequest() {
        return V3CarCreateRequest.builder()
                .dtoType(CAR)
                .name("test name")
                .color(BLUE)
                .price("999999")
                .type(BMW)
                .build();
    }

    public V3CompanyCreateRequest makeV3CompanyRequest() {
        return V3CompanyCreateRequest.builder()
                .dtoType(COMPANY)
                .name("test name")
                .address("test address")
                .ceoName("tset ceo name")
                .sales("999999999")
                .build();
    }

    public V3PersonCreateRequest makeV3PersonRequest() {
        return V3PersonCreateRequest.builder()
                .dtoType(PERSON)
                .name("test name")
                .age(29)
                .favorate("favorate")
                .gender(MALE)
                .build();
    }
}
