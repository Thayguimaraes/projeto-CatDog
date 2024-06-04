package com.catdog.api.controller;

import com.catdog.api.entity.Especie;
import com.catdog.api.repository.EspecieRepository;
import com.catdog.api.service.EspecieService;
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
public class EspecieController {

    private final EspecieService especieService;
    @Autowired
    private EspecieRepository especieRepository;

    @Autowired
    public EspecieController(EspecieService especieService) {

        this.especieService = especieService;
    }



    @GetMapping("/GetEspecie")
    public List<Especie> getEspecie(){
        return especieService.getEspecie();
    }

    @GetMapping("/GetEspecieById/{id}")
    public Especie getEspecieById(@PathVariable Long id) {
        var especieOptional = especieRepository.findById(id);
        if (especieOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return especieOptional.get();
    }

    @PostMapping("/GetEspecie")
    public String salvar(@RequestBody Especie especie){
        especieRepository.save(especie);
        return "Especie Cadastrado com sucesso";
    }


    @DeleteMapping("/DeleteEspecie/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String excluirEspeciePorId(@PathVariable Long id) {
        var especieOptional = especieRepository.findById(id);
        if (especieOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        especieRepository.delete(especieOptional.get());
        return "Especie Excluido com sucesso";
    }



}
