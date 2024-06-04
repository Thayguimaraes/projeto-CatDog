package com.catdog.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int Id;

    @Column(name = "nome")
    private String Nome;

    @Column(name = "telefone")
    private String Telefone;

    @Column(name = "cpf")
    private String Cpf;
<<<<<<< HEAD
//
//    public Cliente(String nome, String telefone, String cpf){
//        this.Name = nome;
//        this.Telefone = telefone;
//        this.Cpf = cpf;
//    }
=======
>>>>>>> e0fb03397793fd59618c3643cae028f93c7b09ab

    public int getId() {
        return Id;
    }
<<<<<<< HEAD
    public String getNameCliente() {
        return Nome;
    }
    public String getcpfCliente() {
        return Cpf;
    }
    public String getTelefoneCliente() {
        return Telefone;
    }
    public void setId(int id) {
        Id = id;
    }
=======

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }
>>>>>>> e0fb03397793fd59618c3643cae028f93c7b09ab
}