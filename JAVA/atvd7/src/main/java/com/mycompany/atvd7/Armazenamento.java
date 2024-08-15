/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvd7;

/**
 *
 * @author Aluno
 */
public class Armazenamento extends Repetidor {
    private double armazenamento;
    private String conexao;

    public Armazenamento(double armazenamento, String conexao, String marca, String modelo) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
        this.conexao = conexao;
    }

    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
    
    
}
