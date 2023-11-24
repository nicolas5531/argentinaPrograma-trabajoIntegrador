package com.grupo1.tpintegrador.repositories;

import com.grupo1.tpintegrador.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepositoryJPA extends JpaRepository<Client, Integer> {
    Optional<Client> findByCuit(Integer cuit);
}
