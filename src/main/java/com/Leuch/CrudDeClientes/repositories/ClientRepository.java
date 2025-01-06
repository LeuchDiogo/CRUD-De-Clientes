package com.Leuch.CrudDeClientes.repositories;

import com.Leuch.CrudDeClientes.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
