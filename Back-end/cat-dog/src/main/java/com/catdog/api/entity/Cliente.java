package com.catdog.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name = "nome", length = 200)
    private String Name;
    @Column(name = "telefone", length = 15)
    private String Telefone;
    @Column(name = "cpf", length = 45)
    private String Cpf;


    public int getId() {
        return Id;
    }
    public String getNameCliente() {
        return Name;
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

    public void setName(String name, String telefone, String cpf) {
        Name = name;
        Telefone = telefone;
        Cpf = cpf;
    }

}