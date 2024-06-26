package com.catdog.api.controller;

import com.catdog.api.entity.Cliente;
import com.catdog.api.repository.ClienteRepository;
import com.catdog.api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class ClienteController {

    private final ClienteService clienteService;
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/Cliente")
    public List<Cliente> getCliente(){
        return clienteService.getCliente();
    }
    @GetMapping("/GetClienteById/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        var clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return clienteOptional.get();
    }

    @PostMapping("/CreateCliente")
    public String salvar(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return "Cliente criado com sucesso!";
    }

    @DeleteMapping("/Cliente/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String excluirClientePorId(@PathVariable Long id) {
        var clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        clienteRepository.delete(clienteOptional.get());
        return "Cliente Excluido com sucesso";
    }

}
