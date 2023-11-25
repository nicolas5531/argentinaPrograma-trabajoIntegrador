package com.grupo1.tpintegrador.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.http.converter.json.GsonBuilderUtils;


import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "incident")
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_incident")
    private Integer id;

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
    @JoinColumn(name = "id_client")  // Cambiado a "id_client" ya que parece que tu columna se llama así
    private Client client;

    @ManyToOne
    @JoinColumn(name = "technician_id")  // Cambiado a "technician_id" ya que parece que tu columna se llama así
    private Technician technician;

    @OneToMany(mappedBy = "incident")  // Corregido aquí
    private List<Issue> issueList;

    @OneToOne
    @JoinColumn(name = "id_service")  // Cambiado a "id_service" ya que parece que tu columna se llama así
    private Service service;
}