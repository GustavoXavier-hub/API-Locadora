package com.FastMoving.api_locadora.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Getter
@Setter
@Table(name = "prestador")
@Entity
@JsonIgnoreProperties({ "pessoa" })
public class Prestador {

    @Id
    @GenericGenerator(
            name = "SEQ_PRESTADOR",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "SEQ_PRESTADOR"),
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRESTADOR")
    @Column(name = "id_prestador")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_func")
    @OneToOne
    private Pessoa pessoa;

    @Column(name = "cnh_prestador")
    private String cnh;

}