package com.example;

public enum Sexo {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino"),
    OUTRO('O', "Outro");

    char sigla;
    String descricao;

    private Sexo(char sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
