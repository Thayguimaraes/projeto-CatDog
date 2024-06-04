package com.catdog.api.service;

<<<<<<< HEAD
=======
import com.catdog.api.entity.Funcionario;
>>>>>>> e0fb03397793fd59618c3643cae028f93c7b09ab
import com.catdog.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
=======
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    public List<Funcionario> getFuncionario(){
        return funcionarioRepository.findAll();
    }
>>>>>>> e0fb03397793fd59618c3643cae028f93c7b09ab
}
