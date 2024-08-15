package com.example;

public class Funcionario {
    int id;
    String nome;
    double salario;
    int idade;
    Setor setor;
    Sexo sexo;
    
    public Funcionario(int id, String nome, double salario, int idade, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.setor = setor;
        this.sexo = sexo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    
}
