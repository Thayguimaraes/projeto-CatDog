package com.catdog.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "servicos")
public class Servico {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int Id;
    @Column(name = "nome_servico", length = 200)
    private String NomeServico;
    @Column(name = "preco", length = 15)
    private double Preco;



    public int getId() {
        return Id;
    }
    public String getNameServico() {
        return NomeServico;
    }
    public double getPrecoServico() {
        return Preco;
    }


    public void setId(int id) {
        Id = id;
    }

    public void setNomeServico(String nomeServico) {
        NomeServico = nomeServico;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }
}