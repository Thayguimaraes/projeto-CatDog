package com.catdog.api.service;

import com.catdog.api.entity.Servico;
import com.catdog.api.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;
    public List<Servico> getServico(){
        return servicoRepository.findAll();
    }
}
