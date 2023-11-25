package com.grupo1.tpintegrador.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "tb_incident")
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "incident_id")
    private Integer incidentId;

    @Column(name = "fechaIngeso")
    private LocalDateTime fechaIngreso;

    @Column(name = "fechaPosibleResolucion")
    private LocalDateTime fechaPosibleResolucion;

    @Column(name = "fechaResolucion")
    private LocalDateTime fechaResolucion;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "hsEstimadasTotales")
    private int hsEstimadasTotales;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client clientId;

    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technicianId;

    @OneToMany(mappedBy = "incidentId", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Issue> issues;

    @OneToOne
    @JoinColumn(name = "serviceId")  // Cambiado a "id_service" ya que parece que tu columna se llama así
    private Service service;
}