package com.dio.academiadigital.controller;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.form.AlunoForm;
import com.dio.academiadigital.services.exceptions.DataNullException;
import com.dio.academiadigital.services.impl.AlunoServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "/aluno")
@Api(tags = "Aluno Controller")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> findAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);

    }
}
