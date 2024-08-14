/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvd5;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Pet pet = new Pet("Pato no PES", "Arthur", 18);
        
        Cliente cliente = new Cliente("Renan", 17, pet);
        
        System.out.println("== Dados do Cliente ==");
        System.out.println("Nome:" + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        
        System.out.println("== Dados do Pet ==");
        System.out.println("Nome: " + cliente.getPet().getNome());
        System.out.println("Raca: " + cliente.getPet().getRaca());
        System.out.println("Idade: " + cliente.getPet().getIdade());
    }
}
