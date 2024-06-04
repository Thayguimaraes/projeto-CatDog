package com.catdog.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity

public class Especie {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name = "nome")
    private String nome;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}