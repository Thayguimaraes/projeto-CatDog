package com.catdog.api.controller;

import com.catdog.api.entity.EstadoCivil;
import com.catdog.api.repository.EstadoCivilRepository;
import com.catdog.api.service.EstadoCivilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class EstadoCivilController {

    private final EstadoCivilService estadoCivilService;
    @Autowired
    private EstadoCivilRepository estadoCivilRepository;

    @Autowired
    public EstadoCivilController(EstadoCivilService estadoCivilService) {

        this.estadoCivilService = estadoCivilService;
    }



    @GetMapping("/GetEstadoCivil")
    public List<EstadoCivil> getEstadoCivil(){
        return estadoCivilService.getEstadoCivil();
    }

    @GetMapping("/GetEstadoCivilById/{id}")
    public EstadoCivil getEstadoCivilById(@PathVariable Long id) {
        var EstadoCivilOptional = estadoCivilRepository.findById(id);
        if (EstadoCivilOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return EstadoCivilOptional.get();
    }

    @PostMapping("/CreateEstadoCivil")
    public String salvar(@RequestBody EstadoCivil estadoCivil){
        estadoCivilRepository.save(estadoCivil);
        return "Estado Civil Cadastrado com sucesso";
    }


    @DeleteMapping("/DeleteEstadoCivil/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String excluirEstadoCivilPorId(@PathVariable Long id) {
        var estadoCivilOptional = estadoCivilRepository.findById(id);
        if (estadoCivilOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        estadoCivilRepository.delete(estadoCivilOptional.get());
        return "Estado Civil Excluido com sucesso";
    }



}
