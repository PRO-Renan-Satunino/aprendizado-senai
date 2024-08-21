package com.example;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua das Flores", "17", "Do lado do Balde de Lixo", "21082024",
                "Cidade dos Sonhos", UF.BA);

        Funcionario func1 = new Funcionario(12, "Jose", "120.221.334-23", "21.300.552-2", "12223", "12/02/2001",
                Sexo.MASCULINO, Setor.JURIDICO, 9200, "71 9.8522-5534", "josebezerra@gmail.com", endereco1);

        // Exibindo Resultados
        System.out.println("\n");
        System.out.println("--Funcionario--");
        System.out.println("ID:" + func1.id);
        System.out.println("Nome: " + func1.nome);
        System.out.println("CPF: " + func1.cpf);
        System.out.println("RG: " + func1.rg);
        System.out.println("Matricula: " + func1.matricula);
        System.out.println("Data de Nascimento: " + func1.dataNascimento);
        System.out.println("Sexo: " + func1.sexo.getDescricao());
        System.out.println("Setor: " + func1.setor.getSetor());
        System.out.println("Salario: " + func1.salario);
        System.out.println("Telefone: " + func1.telefone);
        System.out.println("Email: " + func1.email);
        System.out.println("------------------------------------------------");
        // EXIBINDO ENDERECO
        System.out.println("\n--Endereco-- ");
        System.out.println("Cidade: " + func1.getEndereco().cidade);
        System.out.println("Complemento: " + func1.getEndereco().complemento);
        System.out.println("Logradouro: " + func1.getEndereco().logradouro);
        System.out.println("Numero: " + func1.getEndereco().numero);
        System.out.println("CEP: " + func1.getEndereco().cep);
        System.out.println("Estado: " + func1.getEndereco().uf.getFederacao() + "/"+func1.getEndereco().uf);
        System.out.println("------------------------------------------------------------------");
        System.out.println("\n");
    }
}