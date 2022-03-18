package com.ming.abstractservice.domain.person.controller;

import com.ming.abstractservice.domain.person.dto.request.PersonCreateRequest;
import com.ming.abstractservice.domain.person.dto.response.PersonCreateResponse;
import com.ming.abstractservice.domain.person.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService service;

    @PostMapping
    public PersonCreateResponse create(
            @RequestBody PersonCreateRequest request) {

        return service.create(request);
    }
}
