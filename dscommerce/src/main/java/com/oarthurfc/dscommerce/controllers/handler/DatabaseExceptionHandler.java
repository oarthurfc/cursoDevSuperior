package com.oarthurfc.dscommerce.controllers.handler;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.oarthurfc.dscommerce.dto.CustomError;
import com.oarthurfc.dscommerce.services.exceptions.DatabaseException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class DatabaseExceptionHandler {
    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<CustomError> databaseExcpetion(DatabaseException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.CONFLICT;
        CustomError err = new CustomError(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}