package com.example;

public class Cliente extends Fisica {
    String protocoloAtendimento;

    public Cliente(String nome, String telefone, String email, Endereco endereco, Sexo sexo, EstadoCivil estadoCivil,
            String dataNascimento, String protocoloAtendimento) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nProtocolo de Atendimento: " + protocoloAtendimento +
                "\nSexo: " + sexo.getTexto() +
                "\nTelefone: " + telefone +
                "\nEstado Civil: " + estadoCivil +
                "\nEmail: " + email +
                "\nData de Nascimento: " + dataNascimento +
                "\nEndereco: " + endereco;
    }

}
