package com.ming.abstractservice.domain.company.internal;

import com.ming.abstractservice.domain.company.entity.Company;
import com.ming.abstractservice.entity.V3AbstractEntity;
import com.ming.abstractservice.internal.V3AbstractInternal;
import com.ming.abstractservice.util.IdGenerator;

public interface CompanyClient extends V3AbstractInternal {

    default Company createNewCompany() {

        return Company.builder()
                .id(IdGenerator.getNumberId())
                .name("ming-company")
                .ceoName("minjae")
                .address("address")
                .sales("99800000000000")
                .build();
    }

    @Override
    default V3AbstractEntity createEntity() {
        return createNewCompany();
    }
}
