package com.example;

public enum UF {
    BA('B', "Bahia"),
    SP('S', "São Paulo"),
    RJ('R', "Rio de Janeiro");

    char sigla;
    String federacao;

    private UF(char sigla, String federacao) {
        this.sigla = sigla;
        this.federacao = federacao;
    }
    public char getSigla() {
        return sigla;
    }
    public void setSigla(char sigla) {
        this.sigla = sigla;
    }
    public String getFederacao() {
        return federacao;
    }
    public void setFederacao(String federacao) {
        this.federacao = federacao;
    }


    
}
