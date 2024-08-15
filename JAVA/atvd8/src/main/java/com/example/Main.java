package com.example;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(12, "Maicon", 4200, 23, Setor.VENDAS, Sexo.MASCULINO);

        System.out.println("Informacoes do Funcionario: ");
        System.out.println("ID: " + funcionario.id);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salario: " + funcionario.salario);
        System.out.println("Setor: " + funcionario.setor);
        System.out.println("Sexo: " + funcionario.sexo);
    }
}