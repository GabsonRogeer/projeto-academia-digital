package com.dio.academiadigital.controller;

import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.dio.academiadigital.services.impl.AvaliacaoFisicaServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avaliacoes")
@Api(tags = "Avaliação Fisica Controller")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }

}
