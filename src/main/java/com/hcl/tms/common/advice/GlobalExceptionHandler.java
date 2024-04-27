package com.hcl.tms.common.advice;

import com.hcl.tms.common.exception.TMSException;
import com.hcl.tms.viewmodel.ApiResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
import java.util.UUID;

@ControllerAdvice
@Log4j2
public class GlobalExceptionHandler {

    @ExceptionHandler(TMSException.class)
    protected ResponseEntity<Object> handleHmsApiException(TMSException ex) {
        log.error(ex);
        ApiResponse response = ApiResponse.builder().message(ex.getMessage()).referenceId(UUID.randomUUID().toString())
                .responseTime(Instant.now()).build();
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleException(Exception ex) {
        log.error(ex);
        ApiResponse response = ApiResponse.builder().message("Internal server error").referenceId(UUID.randomUUID().toString())
                .responseTime(Instant.now()).build();
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
