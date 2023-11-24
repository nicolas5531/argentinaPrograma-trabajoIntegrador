package com.grupo1.tpintegrador.repositories;

import com.grupo1.tpintegrador.entities.Client;

import java.util.NoSuchElementException;

public interface IClientRepository {
    Client save(Client client);

    Client findById(Integer id) throws NoSuchElementException;

    Client findByCuit(Integer cuit) throws NoSuchElementException;
}
