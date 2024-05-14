package com.catdog.api.service;

import com.catdog.api.entity.Cliente;
import com.catdog.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    public List<Cliente> getCliente(){
        return clienteRepository.findAll();
    }


}
