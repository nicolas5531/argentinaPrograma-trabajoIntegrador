package com.grupo1.tpintegrador.repositories;

import com.grupo1.tpintegrador.entities.Client;
import org.springframework.stereotype.Repository;

import java.util.NoSuchElementException;

@Repository
public class ClientRepositorySQL implements IClientRepository {
    private final ClientRepositoryJPA clientRepositoryJPA;

    public ClientRepositorySQL(ClientRepositoryJPA clientRepositoryJPA) {
        this.clientRepositoryJPA = clientRepositoryJPA;
    }

    @Override
    public Client save(Client client) {
        client = clientRepositoryJPA.save(client);
        return client;
    }

    @Override
    public Client findById(Integer id) throws NoSuchElementException {
        return clientRepositoryJPA.findById(id)
                .orElseThrow(this::getClientNotFoundException);
    }

    @Override
    public Client findByCuit(Integer cuit) throws NoSuchElementException {
        return clientRepositoryJPA.findByCuit(cuit)
                .orElseThrow(this::getClientNotFoundException);
    }

    private NoSuchElementException getClientNotFoundException() {
        return new NoSuchElementException("Client not found");
    }
}
