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
    @GenericGenerator(name = "UUID", type = org.hibernate.id.uuid.UuidGenerator.class)
    private Integer id;
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaPosibleResolucion;
    private LocalDateTime fechaResolucion;
    //private EstadoEnum estado;
    private String descripcion;
    private int hsEstimadasTotales;
}
