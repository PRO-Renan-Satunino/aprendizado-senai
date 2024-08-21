package com.example;

public class Motoboy extends Funcionario {
    String cnh;

    public Motoboy(String nome, String cpf, String rg, double salario, String cnh) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMotoboy" +
                "\nCNH: " + cnh;
    }

}
