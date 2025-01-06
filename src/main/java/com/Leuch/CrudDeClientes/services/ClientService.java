package com.Leuch.CrudDeClientes.services;

import com.Leuch.CrudDeClientes.Entities.Client;
import com.Leuch.CrudDeClientes.dto.ClientDTO;
import com.Leuch.CrudDeClientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id)
    {
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        return new ClientDTO(client);
    }

}
