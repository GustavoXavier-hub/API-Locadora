package com.FastMoving.api_locadora.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.Date;

@Table(name = "pessoa")
@Entity
@Getter
@Setter
@JsonIgnoreProperties({ "tipoPessoa", "empresa" })
public class Pessoa {

    @Id
    @GenericGenerator(
            name = "SEQ_PESSOA",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SEQ_PESSOA"),
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PESSOA")
    @Column(name = "id_func")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tp_pessoa")
    private TipoPessoa tipoPessoa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_emp")
    private Empresa empresa;

    @Column(name = "nm_func")
    private String nomeFuncionario;

    @Column(name = "dat_nas_func")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

    @Column(name = "rg_func")
    private String registroFuncionario;

    @Column(name = "cpf_func")
    private String cpfFuncionario;

    @Column(name = "cp_func")
    private String carteiraFuncionario;

}