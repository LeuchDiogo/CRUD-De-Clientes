package com.Leuch.CrudDeClientes.services;

import com.Leuch.CrudDeClientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository repository;



}
