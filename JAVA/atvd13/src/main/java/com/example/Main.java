package com.example;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua das Flores", "777", "Lado oposto ao Balde de Lixo", "62299-777",
                "Salvador", UF.BA);
        Cliente cliente1 = new Cliente("Joaozinho", "71 9.8224-2231", "joaozin@gmail.com", endereco1, Sexo.MASCULINO,
                EstadoCivil.SOLTEIRO, "22/02/2002", "2221223234");

        Endereco endereco2 = new Endereco("Rua das Empresas", "10", "Tem o nome na porta", "01222-323", "Sao Paulo",
                UF.SP);
        PrestacaoServico servico1 = new PrestacaoServico("Google", "0800-202-334", "google@hotmail.com", endereco2,
                "221212121", "Privada", "01/08/2001", "31/12/2060");

        System.out.println("\n==Exibindo Resultados==");
        System.out.println("\n\n--DADOS DO CLIENTE--");
        System.out.println(cliente1);
        System.out.println(servico1);
        System.out.println("\n");
    }
}