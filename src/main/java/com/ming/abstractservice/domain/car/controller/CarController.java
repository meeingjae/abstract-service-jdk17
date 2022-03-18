package com.ming.abstractservice.domain.car.controller;

import com.ming.abstractservice.domain.car.dto.request.CarCreateRequest;
import com.ming.abstractservice.domain.car.dto.response.CarCreateResponse;
import com.ming.abstractservice.domain.car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService service;

    @PostMapping
    public CarCreateResponse create(
            @RequestBody CarCreateRequest request) {

        return service.create(request);
    }
}
