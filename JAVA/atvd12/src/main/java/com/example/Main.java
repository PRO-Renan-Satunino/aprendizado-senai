package com.example;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua das Flores", "777", "Em frente ao Balde de Lixo", "9777-177",
                "Sao paulo", UF.SP);
        Fisica fisica1 = new Fisica("Joao", "71 9.8422-1212", "jaozinho@gmail.com", endereco1, Sexo.MASCULINO,
                "17/07/2007");

        System.out.println("\nExibindo Resultados: ");
        System.out.println("\n\n");
        System.out.println("Pessoa 1: " + fisica1);
    }
}