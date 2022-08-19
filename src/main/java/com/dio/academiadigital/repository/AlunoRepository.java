package com.dio.academiadigital.repository;

import com.dio.academiadigital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
