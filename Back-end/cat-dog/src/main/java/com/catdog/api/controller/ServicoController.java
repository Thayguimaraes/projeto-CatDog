package com.catdog.api.controller;

import com.catdog.api.entity.Servico;
import com.catdog.api.repository.ServicoRepository;
import com.catdog.api.service.ServicoService;
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
public class ServicoController {

    private final ServicoService servicoService;
    @Autowired
    private ServicoRepository servicoRepository;
    @Autowired
    public ServicoController(ServicoService servicoService) {

        this.servicoService = servicoService;
    }
    @GetMapping("/GetServico")
    public List<Servico> getServico(){
        return servicoService.getServico();
    }

    @GetMapping("/GetServicoById/{id}")
    public Servico getServicoById(@PathVariable Long id) {
        var servicoOptional = servicoRepository.findById(id);
        if (servicoOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return servicoOptional.get();
    }

    @PostMapping("/CreateServico")
    public String salvar(@RequestBody Servico servico){
        servicoRepository.save(servico);
        return "Cliente Cadastrado com sucesso";
    }
    @DeleteMapping("/DeleteServico/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String excluirServicoPorId(@PathVariable Long id) {
        var servicoOptional = servicoRepository.findById(id);
        if (servicoOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        servicoRepository.delete(servicoOptional.get());
        return "Cliente excluido com sucesso!";
    }


}
