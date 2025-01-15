package com.FastMoving.api_locadora.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Getter
@Setter
@Table(name = "tp_pessoa")
public class TipoPessoa {

    @Id
    @GenericGenerator(
            name = "SEQ_TIPOPESSOA",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SEQ_TIPOPESSOA"),
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPOPESSOA")
    @Column(name = "id_tp_pessoa")
    private Integer id;

    @Column(name = "dsc_tp_pessoa")
    private String descricao;

}
