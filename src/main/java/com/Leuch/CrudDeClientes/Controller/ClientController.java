package com.Leuch.CrudDeClientes.Controller;


import com.Leuch.CrudDeClientes.dto.ClientDTO;
import com.Leuch.CrudDeClientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id)
    {
        ClientDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

}
