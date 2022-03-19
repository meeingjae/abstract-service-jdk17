package com.ming.abstractservice.domain.company.internal;

import com.ming.abstractservice.domain.company.entity.Company;
import com.ming.abstractservice.util.IdGenerator;

public interface CompanyClient {

    default Company createNewCompany() {

        return Company.builder()
                .id(IdGenerator.getNumberId())
                .name("ming-company")
                .ceoName("minjae")
                .address("address")
                .sales("99800000000000")
                .build();
    }
}
