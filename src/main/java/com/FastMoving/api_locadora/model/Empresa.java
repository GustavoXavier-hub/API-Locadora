package com.FastMoving.api_locadora.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Getter
@Setter
@Table(name = "empresa")
public class Empresa {

    @Id
    @GenericGenerator(
            name = "SEQ_EMPRESA",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SEQ_EMPRESA"),
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPRESA")
    @Column(name = "id_emp")
    private Integer id;

    @Column(name = "nm_emp")
    private String nome;

    @Column(name = "cnpj_emp")
    private String cnpj;




}
