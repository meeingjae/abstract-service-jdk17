package com.ming.abstractservice.domain.company.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Company {

    private final long id;

    private final String name;

    private final String address;

    private final String ceoName;

    private final String sales;
}
