package com.br.elton.client.service;

import com.br.elton.client.entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public Client saveClient(Client client);

    public Optional<Client> findClientById(Long idClient) throws Exception;

    public List<Client> findClients();

}
