package com.FastMoving.api_locadora.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.Date;

@Getter
@Setter
@Data
@Entity
@Table(name ="cartao")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CARTAO")
    @GenericGenerator(
            name = "SEQ_CARTAO",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SEQ_CARTAO"),
            }
    )
    @Column(name = "id_cartao")
    private Integer id;

    @Column(name = "nome_cartao")
    private  String nome;

    @Column(name = "data_vencimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVencimento;

    @Column(name = "codigo_verificacao")
    private int codigo;

    @Column(name = "numero_cartao", columnDefinition = "NUMERIC")
    private Long numero;

}
