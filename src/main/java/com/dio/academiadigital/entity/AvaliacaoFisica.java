package com.dio.academiadigital.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private LocalDateTime dataDaAvalicao = LocalDateTime.now();

    @Column(name = "peso_atual")
    private double peso;

    @Column(name = "altura_atual")
    private double altura;
}
