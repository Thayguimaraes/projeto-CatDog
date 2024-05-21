package com.catdog.api.controller;

import com.catdog.api.entity.Cliente;
import com.catdog.api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/GetCliente")
    public List<Cliente> getCliente(){
        return clienteService.getCliente();
    }

    @PostMapping("/CreateCliente")
    public void createCliente(){
        Cliente client = new Cliente("Thaynara", "123456789", "12345678900");
        System.out.println(client);
    }
}