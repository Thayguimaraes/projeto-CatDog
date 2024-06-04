package com.catdog.api.entity;

<<<<<<< HEAD
import jakarta.persistence.*;

@Entity
=======
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity

>>>>>>> e0fb03397793fd59618c3643cae028f93c7b09ab
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int Id;
<<<<<<< HEAD
}
=======
    @Column(name = "nome")
    private String Name;
    @Column(name = "cpf")
    private String Cpf;
    @Column(name = "telefone")
    private String Telefone;
    @Column(name = "cargo")
    private String Cargo;
    @Column(name = "data_nascimento")
    private String DataNascimento;
    @Column(name = "sexo")
    private int Sexo;
    @Column(name = "cor")
    private String Cor;
    @Column(name = "estado_civil")
    private int EstadoCivil;

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int sexo) {
        Sexo = sexo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public int getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        EstadoCivil = estadoCivil;
    }
}
>>>>>>> e0fb03397793fd59618c3643cae028f93c7b09ab
