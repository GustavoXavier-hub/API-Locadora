package com.FastMoving.api_locadora.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "veiculo")
@JsonIgnoreProperties({ "prestador" })
public class Veiculo {

    @Id
    @GenericGenerator(name = "SEQ_VEICULO", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
            @Parameter(name = "sequence_name", value = "SEQ_VEICULO"), })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VEICULO")
    @Column(name = "id_ve")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prestador")
    private Prestador prestador;

    @Column(name = "pl_ve")
    private String placa;

    @Column(name = "cor_ve")
    private String cor;

    @Column(name = "marca_ve")
    private String marca;

    @Column(name = "doc_ve")
    private String documento;

    @Column(name = "modelo_ve")
    private String modelo;

    @Column(name = "ano_ve")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ano;

    @Column(name = "km_ve", columnDefinition = "NUMERIC")
    private Long kilometragem;

    @Column(name = "status_ve")
    private String status;

    @Column(name = "rastreador_ve")
    private String rastreador;

    @Column(name = "cod_rastreador_ve")
    private int codigoRastreador;
}