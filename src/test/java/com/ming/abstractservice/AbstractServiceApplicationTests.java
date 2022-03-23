package com.ming.abstractservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ming.abstractservice.controller.AbstractController;
import com.ming.abstractservice.domain.car.controller.CarController;
import com.ming.abstractservice.domain.car.dto.request.CarCreateRequest;
import com.ming.abstractservice.domain.car.entity.Car;
import com.ming.abstractservice.domain.car.service.CarService;
import com.ming.abstractservice.domain.company.controller.CompanyController;
import com.ming.abstractservice.domain.company.service.CompanyService;
import com.ming.abstractservice.domain.person.controller.PersonController;
import com.ming.abstractservice.domain.person.service.PersonService;
import com.ming.abstractservice.service.V2Service;
import com.ming.abstractservice.service.V3Service;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ComponentScan
@AutoConfigureMockMvc
@SpringBootTest
class AbstractServiceApplicationTests {

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

    @Test
    void contextLoads() {

    }

    @DisplayName("v1 - car create")
    @Test
    public void v1CarCreate() throws Exception {

        CarCreateRequest carCreateRequest = CarCreateRequest.builder()
                .name("ming")
                .color(Car.CarColor.BLUE)
                .price("9999")
                .type(Car.CarType.BMW)
                .build();

        mockMvc.perform(MockMvcRequestBuilders.post("/car")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(carCreateRequest)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.carId", 1L).exists())
                .andExpect(jsonPath("$.carName", "ming").exists());
    }
}
