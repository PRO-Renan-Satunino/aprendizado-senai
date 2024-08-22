package com.example;

public enum Sexo {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");

    char sigla;
    String texto;

    private Sexo(char sigla, String texto) {
        this.sigla = sigla;
        this.texto = texto;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
