package com.leonardosimao.osclimatizacao.entity;

import com.leonardosimao.osclimatizacao.entity.StatusOS;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordens_servico")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Double valor;

    @Enumerated(EnumType.STRING)
    private StatusOS status;

    private LocalDateTime dataAbertura;
    private LocalDateTime dataFechamento;

    // ---- NOVOS CAMPOS DE CLIMATIZAÇÃO ----
    private String marcaAparelho;
    private String modeloAparelho;
    private Integer capacidadeBtus; // Ex: 9000, 12000, 18000
    // --------------------------------------

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // ---- NOVO RELACIONAMENTO ----
    @ManyToOne
    @JoinColumn(name = "tecnico_id") // Cria a coluna tecnico_id no banco de dados
    private Tecnico tecnico;
}
