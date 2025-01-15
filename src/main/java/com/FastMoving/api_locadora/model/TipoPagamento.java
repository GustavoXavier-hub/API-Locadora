package com.FastMoving.api_locadora.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Getter
@Setter
@Table(name = "TipoPagamento")
public class TipoPagamento {

    @Id
    @GenericGenerator(
            name = "SEQ_TIPOPAGAMENTO",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SEQ_TIPOPAGAMENTO"),
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIPOPAGAMENTO")
    @Column(name = "id_tp_pgto")
    private Integer id;

    @Column(name = "dsc_tp_pgto")
    private String descricao;

}
