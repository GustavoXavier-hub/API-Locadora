package com.FastMoving.api_locadora.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "contrato_servico")
@JsonIgnoreProperties({"cliente", "funcionario", "prestador"})
public class ContratoServico {

    @Id
    @GenericGenerator(
            name = "SEQ_CONTSERV",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SEQ_CONTSERV"),
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTSERV")
    @Column(name = "id_contrato_Serv")
    private Integer id;

    @Column(name="cubagem_serv",columnDefinition = "NUMERIC")
    private Long cubagem;

    @Column(name = "dat_serv")
    private Date data;

    @Column(name = "vl_pgto",columnDefinition = "NUMERIC")
    private Double valorPagamento;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_clie")
    private Cliente cliente;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_func")
    private Pessoa funcionario;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_prestador")
    private Prestador prestador;



}