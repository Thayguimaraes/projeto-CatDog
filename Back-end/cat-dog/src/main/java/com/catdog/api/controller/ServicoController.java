package com.catdog.api.controller;

import com.catdog.api.entity.Servico;
import com.catdog.api.repository.ServicoRepository;
import com.catdog.api.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class ServicoController {

    private final ServicoService servicoService;

    @Autowired
    public ServicoController(ServicoService servicoService) {

        this.servicoService = servicoService;
    }



    @GetMapping("/GetServico")
    public List<Servico> getServico(){
        return servicoService.getServico();
    }





}
