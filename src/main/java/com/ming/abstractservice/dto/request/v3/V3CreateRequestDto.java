package com.ming.abstractservice.dto.request.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ming.abstractservice.internal.InternalClientFactory;
import com.ming.abstractservice.internal.V3AbstractInternal;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "dtoType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = V3CarCreateRequest.class, name = "CAR"),
        @JsonSubTypes.Type(value = V3CompanyCreateRequest.class, name = "COMPANY"),
        @JsonSubTypes.Type(value = V3PersonCreateRequest.class, name = "PERSON") })
@Getter
@RequiredArgsConstructor
public abstract class V3CreateRequestDto {

    public abstract V3AbstractInternal getClient(InternalClientFactory factory);

    public enum DtoType {
        CAR,
        COMPANY,
        PERSON
    }

}
