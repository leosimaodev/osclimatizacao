package com.leonardosimao.osclimatizacao.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tecnicos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private String especialidade; // Ex: "Instalador VRF", "Eletricista", "Limpeza"
}