package com.catdog.api.service;

import com.catdog.api.entity.EstadoCivil;
import com.catdog.api.repository.EstadoCivilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoCivilService {

    @Autowired
    private EstadoCivilRepository estadoCivilRepository;
    public List<EstadoCivil> getEstadoCivil(){
        return estadoCivilRepository.findAll();
    }
}
