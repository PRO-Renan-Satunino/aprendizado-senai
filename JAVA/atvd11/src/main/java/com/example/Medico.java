package com.example;

public class Medico extends Funcionario {
    String crm;

    public Medico(String nome, String cpf, String rg, double salario, String crm) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMedico" +
                "\nCRM: " + crm;
    }

}
