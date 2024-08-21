package com.example;

public class Main {
    public static void main(String[] args) {
        Engenheiro eng1 = new Engenheiro("Paulao", "022.212.442-22", "21.332.554-21", 9000, "tbm n sei nao vey");
        Motoboy mot1 = new Motoboy("Junin", "001.223.552-12", "21.332.111-42", 4000, "Sim");
        Medico med1 = new Medico("Maria", "552.267.332.06", "42.221.222-24", 12000, "sim");

        System.out.println("\nEngenheiro: " + eng1);
        System.out.println("\nMotoboy: " + mot1);
        System.out.println("\nMedico: " + med1);
    }
}