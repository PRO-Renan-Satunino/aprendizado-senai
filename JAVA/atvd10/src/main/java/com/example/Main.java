package com.example;

public class Main {
    public static void main(String[] args) {
        Juridica juridica1 = new Juridica("Paulo", "71 9.8422-3433", "2121.4424.552", "Slla oq e isso");
        Fisica fisica1 = new Fisica("Paulinho", "71 9.8427-2232", "070.525.488-21", "21.334.552-21", "17/05/2001");

        System.out.println("\nPessoa Juridica: " + juridica1);
        System.out.println("\nPessoa Fisica: " + fisica1);
        System.out.println("\n");

    }
}