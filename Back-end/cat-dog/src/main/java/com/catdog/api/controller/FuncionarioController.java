package com.catdog.api.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;
=======
import com.catdog.api.entity.Funcionario;
import com.catdog.api.repository.FuncionarioRepository;
import com.catdog.api.service.FuncionarioService;
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
>>>>>>> e0fb03397793fd59618c3643cae028f93c7b09ab

@RestController
public class FuncionarioController {

<<<<<<< HEAD
=======
    private final FuncionarioService funcionarioService;
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {

        this.funcionarioService = funcionarioService;
    }



    @GetMapping("/GetFuncionario")
    public List<Funcionario> getFuncionario(){
        return funcionarioService.getFuncionario();
    }



    @PostMapping("/CreateFuncionario")
    public String salvar(@RequestBody Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return "Funcionario Cadastrado com sucesso";
    }

    @GetMapping("/GetFuncionarioById/{id}")
    public Funcionario getFuncionarioById(@PathVariable Long id) {
        var funcionarioOptional = funcionarioRepository.findById(id);
        if (funcionarioOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return funcionarioOptional.get();
    }
    @DeleteMapping("/DeleteFuncionario/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public String excluirFuncionarioPorId(@PathVariable Long id) {
        var funcionarioOptional = funcionarioRepository.findById(id);
        if (funcionarioOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        funcionarioRepository.delete(funcionarioOptional.get());
        return "Funcionario Excluido com sucesso";
    }



>>>>>>> e0fb03397793fd59618c3643cae028f93c7b09ab
}
