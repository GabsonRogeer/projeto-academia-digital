package com.dio.academiadigital.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class AlunoNotFoundException extends RuntimeException {

    public AlunoNotFoundException(Long id){
        super("Não foi possível encontrar o produto com o ID:" + id);
    }
}
