/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvd1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */

/*Programa para uma loja que vende seus produtos em 5 prestações. Objetivo é mostrar o nome da loja como resultado e o valor das parcelas*/
public class Atvd1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //declarando variaveis
        Double valor, valorFinal;
        
        //Pedindo valores
        System.out.println("Digite o Valor da Compra: ");
        valor = teclado.nextDouble();
        
        //operacao de prestacao
        valorFinal = valor / 5;
        
        //Mostrando Resultados
        System.out.println("==============================================");
        System.out.println("               Mamão com Açúcar");
        System.out.println("==============================================");
        System.out.println("Valor inteiro: " + valor);
        System.out.println("Valor das Parcelas: " + valorFinal);

        teclado.close(); //serve para informar ao programa que nao recebera mais informacoes do Teclado, mas o programa continua
    }
}
