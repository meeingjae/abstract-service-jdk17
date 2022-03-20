package com.ming.abstractservice.internal;

import com.ming.abstractservice.entity.V3AbstractEntity;

public interface V3AbstractInternal {

    default V3AbstractEntity createEntity() {
        return null;
    }
}
