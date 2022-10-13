package com.dio.academiadigital.services.impl;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.dio.academiadigital.repository.AlunoRepository;
import com.dio.academiadigital.repository.AvaliacaoRepository;
import com.dio.academiadigital.services.AvaliacaoFisicaService;
import com.dio.academiadigital.services.exceptions.AlunoNotFoundException;
import com.dio.academiadigital.services.exceptions.AlunoNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService {

    @Autowired
    private AvaliacaoRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        //impl exception
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).orElseThrow(AlunoNullException::new);
        avaliacao.setAluno(aluno);
        avaliacao.setAltura(form.getAltura());
        avaliacao.setPeso(form.getPeso());
        return repository.save(avaliacao);
    }

    @Override
    public Optional<AvaliacaoFisica> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
