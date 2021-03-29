package com.br.elton.client.service.impl;

import com.br.elton.client.entities.Client;
import com.br.elton.client.repository.ClientMemoryRepository;
import com.br.elton.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMemoryRepository clientMemoryRepository;

    @Override
    public Client saveClient(Client client) {
        return clientMemoryRepository.saveClient(client);
    }

    @Override
    public Optional<Client> findClientById(Long idClient) {
        return clientMemoryRepository.findClientById(idClient);
    }

    @Override
    public List<Client> findClients() {
        return clientMemoryRepository.findClients();
    }

}
