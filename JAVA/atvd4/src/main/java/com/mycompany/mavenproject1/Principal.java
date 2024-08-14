/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        //Criando um endereco
        Endereco endereco = new Endereco("Clover", 69, "Reino de Clover");
        
        //Criando um Cliente com endereco
        Cliente cliente = new Cliente("Asta", 17, endereco);
        
        //Exibindo informacoes do Cliente
        System.out.println("Exibindo Resultados: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("== Dados do Endereco ==");
        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Numero: " + endereco.getNumero());
        System.out.println("Cidade: " + endereco.getCidade());
        
        
    }
}
