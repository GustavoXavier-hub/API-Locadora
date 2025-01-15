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
@Table(name ="cliente")
public class Cliente {

    @Id
    @GenericGenerator(
            name = "SEQ_Clie",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SEQ_Clie"),
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Clie")
    @Column(name = "id_clie")
    private Integer id;

    @Column(name = "nm_clie")
    private String nome;

    @Column(name = "dat_nas_clie")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;

    @Column(name = "tele_cont_clie")
    private String telefone;

    @Column(name = "end_clie")
    private String endereco;

    @Column(name = "sex_clie")
    private String sexo;

}
