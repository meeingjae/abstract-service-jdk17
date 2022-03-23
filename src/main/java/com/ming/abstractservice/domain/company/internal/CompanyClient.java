package com.ming.abstractservice.domain.company.internal;

import com.ming.abstractservice.domain.company.dto.request.CompanyCreateRequest;
import com.ming.abstractservice.domain.company.entity.Company;
import com.ming.abstractservice.dto.request.v3.V3CompanyCreateRequest;
import com.ming.abstractservice.dto.request.v3.V3CreateRequestDto;
import com.ming.abstractservice.entity.V3AbstractEntity;
import com.ming.abstractservice.internal.V3AbstractInternal;
import com.ming.abstractservice.util.IdGenerator;
import org.springframework.stereotype.Component;

@Component
public class CompanyClient implements V3AbstractInternal {

    public Company createNewCompany(CompanyCreateRequest request) {

        return Company.builder()
                .id(IdGenerator.getNumberId())
                .name(request.getName())
                .ceoName(request.getCeoName())
                .address(request.getAddress())
                .sales(request.getSales())
                .build();
    }

    public Company v3CreateNewCompany(V3CompanyCreateRequest request) {

        return Company.builder()
                .id(IdGenerator.getNumberId())
                .name(request.getName())
                .ceoName(request.getCeoName())
                .address(request.getAddress())
                .sales(request.getSales())
                .build();
    }

    @Override
    public V3AbstractEntity createEntity(V3CreateRequestDto requestDto) {

        return v3CreateNewCompany((V3CompanyCreateRequest) requestDto);
    }
}
