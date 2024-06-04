package com.catdog.api.service;

import com.catdog.api.entity.Especie;
import com.catdog.api.repository.EspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecieService {

    @Autowired
    private EspecieRepository especieRepository;
    public List<Especie> getEspecie(){
        return especieRepository.findAll();
    }
}
