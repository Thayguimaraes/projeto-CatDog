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
//
//    public Cliente(String nome, String telefone, String cpf){
//        this.Name = nome;
//        this.Telefone = telefone;
//        this.Cpf = cpf;
//    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Nome;
    }

    public void setName(String name) {
        Nome = name;
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
}