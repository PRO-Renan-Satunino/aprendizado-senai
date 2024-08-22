package atvd14;

public class Main {
    public static void main(String[] args) {
        // DADOS DA SAUDE
        Endereco endereco1 = new Endereco("Alphavella", "21", "Do lado da Beyonce", "21333-122", "California", UF.BA);
        Saude saude1 = new Saude("Gregory House", "71 9.8233-1245", "housethebest@gmail.com", endereco1, Sexo.MASCULINO,
                EstadoCivil.CASADO, "08/02/1970", "123.444.663-12", "21.223.554-21", "12010120", Setor.SAUDE, 12222,
                "sim");

        // DADOS DO FORNECEDOR AMAZON
        Endereco enderecoFornecedor1 = new Endereco("Rua das lojas", "222", "Nome grandao na porta", "41222",
                "Brasilia", UF.RJ);
        Fornecedor fornecedor1 = new Fornecedor("Amazon", "0800-212-333", "contato@amazon.com.br", enderecoFornecedor1,
                "1231.442.211", "Slla", "Eletronicos");

        System.out.println("\n==EXIBINDO RESULTADOS==");
        System.out.println(saude1);
        System.out.println("\n");
        System.out.println("\n==DADOS DO FORNECEDOR==");
        System.out.println(fornecedor1);
    }
}