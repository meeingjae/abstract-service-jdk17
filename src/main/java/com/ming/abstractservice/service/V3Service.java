package com.ming.abstractservice.service;

import com.ming.abstractservice.dto.request.v3.V3CreateRequestDto;
import com.ming.abstractservice.dto.response.v3.V3CreateResponseDto;
import com.ming.abstractservice.entity.V3AbstractEntity;
import com.ming.abstractservice.internal.InternalClientFactory;
import com.ming.abstractservice.internal.V3AbstractInternal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class V3Service {

    private final InternalClientFactory factory;

    /**
     * 추상 클래스를 이용한 service 로직 단순화
     *
     * @param request 요청 추상 클래스
     * @return 응답 데이터
     */
    public V3CreateResponseDto createV3(V3CreateRequestDto request) {

        V3AbstractInternal client = request.getClient(factory);

        V3AbstractEntity entity = client.createEntity();

        return entity.mapToDto();
    }
}
