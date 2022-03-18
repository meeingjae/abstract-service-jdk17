package com.ming.abstractservice.domain.company.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Company {

    private final long id;

    private final String name;

    private final String address;

    private final String ceoName;

    private final String sales;
}
