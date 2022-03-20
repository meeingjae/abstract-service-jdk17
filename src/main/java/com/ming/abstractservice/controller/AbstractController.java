package com.ming.abstractservice.controller;

import com.ming.abstractservice.dto.request.v2.V2CreateRequestDto;
import com.ming.abstractservice.dto.request.v3.V3CreateRequestDto;
import com.ming.abstractservice.dto.response.v2.V2CreateResponseDto;
import com.ming.abstractservice.dto.response.v3.V3CreateResponseDto;
import com.ming.abstractservice.service.V2Service;
import com.ming.abstractservice.service.V3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/abstract")
public class AbstractController {

    private final V2Service v2Service;
    private final V3Service v3Service;

    @PostMapping("/v2")
    public V2CreateResponseDto createV2(
            @RequestBody V2CreateRequestDto request) {

        return v2Service.createV2(request);
    }

    @PostMapping("/v3")
    public V3CreateResponseDto createV3(
            @RequestBody V3CreateRequestDto request) {

        return v3Service.createV3(request);
    }
}
