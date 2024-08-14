/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvd5;

/**
 *
 * @author Aluno
 */
public class Pet {
    private String raca;
    private String nome;
    private int idade;

    public Pet(String raca, String nome, int idade) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }
    
    

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
