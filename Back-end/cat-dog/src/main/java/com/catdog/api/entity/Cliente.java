package com.catdog.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
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
}