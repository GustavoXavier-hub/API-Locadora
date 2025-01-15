package com.FastMoving.api_locadora.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Getter
@Setter
@Table(name ="tp_serv" )
public class TipoServico {

    @Id
    @GenericGenerator(
            name = "SEQ_TIPOSERVICO",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SEQ_TIPOSERVICO"),
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPOSERVICO")
    @Column(name = "id__tp_serv")
    private Integer id;

    @Column(name = "dsc_tp_serv")
    private String descricao;
}
