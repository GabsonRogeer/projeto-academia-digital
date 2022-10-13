package com.dio.academiadigital.controller;

import com.dio.academiadigital.services.exceptions.AlunoNullException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

public class AvaliacaoControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AlunoNullException.class)
    public ResponseEntity<Object> capituraErroNull(){
        Map<String, Object> body = new HashMap<>();

        body.put("messege", "Verifique o campo ID, ele não pode ser Nulo ou menor que 0");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }
}
