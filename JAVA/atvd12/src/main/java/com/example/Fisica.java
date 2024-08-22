package com.example;

public class Fisica extends Pessoa {
    Sexo sexo;
    String dataNascimento;

    public Fisica(String nome, String telefone, String email, Endereco endereco, Sexo sexo, String dataNascimento) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\n\n--Pessoa Fisica--" +
                "\nSexo: " + sexo +
                "\nData de Nascimento: " + dataNascimento +
                super.toString();

    }

}
