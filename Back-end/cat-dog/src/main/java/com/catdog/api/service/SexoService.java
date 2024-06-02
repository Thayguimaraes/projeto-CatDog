package com.catdog.api.service;

import com.catdog.api.entity.Sexo;
import com.catdog.api.repository.SexoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexoService {

    @Autowired
    private SexoRepository sexoRepository;
    public List<Sexo> getSexo(){
        return sexoRepository.findAll();
    }
}
