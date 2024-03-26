package com.catdog.api.service;

import com.catdog.api.entity.Pet;
import com.catdog.api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;
    public List<Pet> getPets(){
        return petRepository.findAll();
    }
}
