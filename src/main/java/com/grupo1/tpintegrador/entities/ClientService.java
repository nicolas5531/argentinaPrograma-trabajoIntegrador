package com.grupo1.tpintegrador.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "clientService")
public class ClientService {
    @Id
    @Column(name = "clientService_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientServiceId;
}
