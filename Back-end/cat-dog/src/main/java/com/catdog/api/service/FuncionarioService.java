package com.catdog.api.service;

import com.catdog.api.entity.Funcionario;
import com.catdog.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    public List<Funcionario> getFuncionario(){
        return funcionarioRepository.findAll();
    }
}
