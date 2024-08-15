/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvd7;

/**
 *
 * @author Aluno
 */
public class Memoria extends Repetidor{
    private double armazenamento;
    private double frequencia;

    public Memoria(double armazenamento, double frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
        this.frequencia = frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
    
    
    
}
