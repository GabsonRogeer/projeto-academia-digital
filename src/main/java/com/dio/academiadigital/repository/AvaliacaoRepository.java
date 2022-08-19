package com.dio.academiadigital.repository;

import com.dio.academiadigital.entity.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository extends JpaRepository<AvaliacaoFisica, Long> {
}
