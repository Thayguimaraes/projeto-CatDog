package com.catdog.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int Id;
    @Column(name = "id_cliente")
    private int IdCliente;
    @Column(name = "sexo")
    private int Sexo;
    @Column(name = "nome")
    private String Nome;
    @Column(name = "raca")
    private String Raca;
    @Column(name = "especie")
    private int Especie;
    @Column(name = "peso")
    private double Peso;
    @Column(name = "cor")
    private String Cor;
    @Column(name = "pelagem")
    private int Pelagem;
    @Column(name = "cadastrado")
    private int Cadastrado;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int sexo) {
        Sexo = sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    public int getEspecie() {
        return Especie;
    }

    public void setEspecie(int especie) {
        Especie = especie;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public int getPelagem() {
        return Pelagem;
    }

    public void setPelagem(int pelagem) {
        Pelagem = pelagem;
    }

    public int getCadastrado() {
        return Cadastrado;
    }

    public void setCadastrado(int cadastrado) {
        Cadastrado = cadastrado;
    }
}
