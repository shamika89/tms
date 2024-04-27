package com.hcl.tms.viewmodel;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;


@Data
@Builder
public class ApiResponse {
    private String message;
    private Object data;
    private Instant responseTime;
    private String referenceId;

    public static ApiResponse success(Object data, String message) {
        return ApiResponse.builder().data(data).message(message)
                .referenceId(UUID.randomUUID().toString()).responseTime(Instant.now()).build();
   }
}

