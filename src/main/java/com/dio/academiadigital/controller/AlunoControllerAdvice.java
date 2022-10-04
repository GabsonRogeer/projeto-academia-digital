package com.dio.academiadigital.controller;

import com.dio.academiadigital.services.exceptions.DataNullException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class AlunoControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DataNullException.class)
    public ResponseEntity<Object> capturaDataNull(){
        Map<String, Object> body = new HashMap<>();
        body.put("messege", "A data de nascimento não pode ser nula");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }
}
