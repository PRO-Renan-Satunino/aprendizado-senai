package atvd14;

public class Fornecedor extends Juridica {

    String produto;

    public Fornecedor(String nome, String telefone, String email, Endereco endereco, String cnpj,
            String inscricaoEstadual, String produto) {
        super(nome, telefone, email, endereco, cnpj, inscricaoEstadual);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCNPJ" + cnpj +
                "\nProduto: " + produto +
                "\nTelefone: " + telefone +
                "\nInscrição Estadual: " + inscricaoEstadual +
                "\nEmail: " + email +
                "\nEndereco: " + endereco;
    }

}
