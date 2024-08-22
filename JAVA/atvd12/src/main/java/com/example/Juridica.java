package com.example;

public class Juridica extends Pessoa {
    String cnpj;
    String inscricaoEstadual;

    public Juridica(String nome, String telefone, String email, Endereco endereco, String cnpj,
            String inscricaoEstadual) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "\n-- Pessoa Juridica--" +
                super.toString() +
                "\nCNPJ: " + cnpj +
                "\nInscrição Estadual: " + inscricaoEstadual;
    }

}
