package com.ming.abstractservice.dto.request.v3;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.ming.abstractservice.internal.InternalClientFactory;
import com.ming.abstractservice.internal.V3AbstractInternal;
import lombok.RequiredArgsConstructor;

@JsonTypeName("COMPANY")
@RequiredArgsConstructor
public class V3CompanyCreateRequest extends V3CreateRequestDto {

    private final DtoType dtoType;

    private final String name;

    private final String address;

    private final String ceoName;

    private final String sales;

    @Override
    public V3AbstractInternal getClient(InternalClientFactory factory) {

        return factory.getCompanyClient();
    }
}
