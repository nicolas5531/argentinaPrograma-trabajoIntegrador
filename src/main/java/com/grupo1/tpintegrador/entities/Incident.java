package com.grupo1.tpintegrador.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "incident")
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaPosibleResolucion;
    private LocalDateTime fechaResolucion;
    //private EstadoEnum estado;
    private String descripcion;
    private int hsEstimadasTotales;
}
