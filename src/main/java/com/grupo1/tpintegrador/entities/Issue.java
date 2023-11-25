package com.grupo1.tpintegrador.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "tb_issue")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issue_id")
    private Integer issueId;

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
    @JoinColumn(name = "incident_id")
    private Incident incidentId;


}
