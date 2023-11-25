package com.grupo1.tpintegrador.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "issue")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fechaIngreso")
    private LocalDateTime fechaIngreso;

    @Column(name = "fechaPosibleResolucion")
    private LocalDateTime fechaPosibleResolucion;

    @Column(name = "fechaResolucion")
    private LocalDateTime fechaResolucion;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "hsEstimadaTotales")
    private int hsEstimadasTotales;

    @ManyToOne
    @JoinColumn(name = "incident_id", referencedColumnName = "id")
    private Incident incident;


}
