package com.grupo1.tpintegrador.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Setter
@Getter
@Table(name = "tb_technicianSpecialty")
public class TechnicianSpecialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technicianSpecialty_id")
    private Integer technicianSpecialtyId;

    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technician technicianId;

    @ManyToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialtyId;
}