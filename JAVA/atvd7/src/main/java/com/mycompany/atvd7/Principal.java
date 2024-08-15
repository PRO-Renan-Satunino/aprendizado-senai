/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvd7;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        // chamando processador
        Processador processador = new Processador(4.2, "ASUS", "I5");

        // memoria ram
        Memoria memoria = new Memoria(16, 3200, "Kingston", "RAM");

        // Placa Mae
        PlacaMae placamae = new PlacaMae("LGA 1190", "ASUS", "TUF Gaming WIFI");

        // Armazenamento
        Armazenamento armazenamento = new Armazenamento(1000, "NVME", "Samsung", "M.2");

        // Mostrando Resultados
        System.out.println("\n== Processador ==");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frequencia: " + processador.getFrequencia());

        System.out.println("\n== Memoria RAM ==");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Armazenamento: " + memoria.getArmazenamento() + " Gb");
        System.out.println("Frequencia: " + memoria.getFrequencia() + " MHz");

        System.out.println("\n== Placa Mae ==");
        System.out.println("Marca: " + placamae.getMarca());
        System.out.println("Modelo: " + placamae.getModelo());
        System.out.println("Soquete: " + placamae.getSoquete());

        System.out.println("\n== Armazenamento ==");
        System.out.println("Marca: " + armazenamento.getMarca());
        System.out.println("Modelo: " + armazenamento.getModelo());
        System.out.println("Conexao: " + armazenamento.getConexao());
        System.out.println("Capacidade: " + armazenamento.getArmazenamento() + " Gb");

    }
}
