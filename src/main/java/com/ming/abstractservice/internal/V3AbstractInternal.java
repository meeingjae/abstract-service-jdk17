package com.ming.abstractservice.internal;

import com.ming.abstractservice.dto.request.v3.V3CreateRequestDto;
import com.ming.abstractservice.entity.V3AbstractEntity;

public interface V3AbstractInternal {

    V3AbstractEntity createEntity(V3CreateRequestDto requestDto);
}
