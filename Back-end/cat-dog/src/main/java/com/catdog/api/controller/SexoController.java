package com.catdog.api.controller;

import com.catdog.api.entity.Sexo;
import com.catdog.api.repository.SexoRepository;
import com.catdog.api.service.SexoService;
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
public class SexoController {

    private final SexoService sexoService;
    @Autowired
    private SexoRepository sexoRepository;
    @Autowired
    public SexoController(SexoService sexoService) {

        this.sexoService = sexoService;
    }
    @GetMapping("/GetSexos")
    public List<Sexo> getSexo(){
        return sexoService.getSexo();
    }

    @GetMapping("/GetSexosByid/{id}")
    public Sexo getSexoById(@PathVariable Long id) {
        var sexoOptional = sexoRepository.findById(id);
        if (sexoOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return sexoOptional.get();
    }

    @PostMapping("/CreateSexo")
    public String salvar(@RequestBody Sexo sexo){
        sexoRepository.save(sexo);
        return "Sexo Cadastrado com sucesso";
    }
    @DeleteMapping("/DeleteSexo/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String excluirSexoPorId(@PathVariable Long id) {
        var sexoOptional = sexoRepository.findById(id);
        if (sexoOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        sexoRepository.delete(sexoOptional.get());
        return "Sexo excluido com sucesso!";
    }


}
