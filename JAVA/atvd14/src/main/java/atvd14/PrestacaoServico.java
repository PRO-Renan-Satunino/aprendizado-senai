package atvd14;

public class PrestacaoServico extends Juridica {
    String inicioContrato;
    String fimContrato;

    public PrestacaoServico(String nome, String telefone, String email, Endereco endereco, String cnpj,
            String inscricaoEstadual, String inicioContrato, String fimContrato) {
        super(nome, telefone, email, endereco, cnpj, inscricaoEstadual);
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public String getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(String fimContrato) {
        this.fimContrato = fimContrato;
    }

    @Override
    public String toString() {
        return "\n\n--DADOS DA EMPRESA--" +
                "\n" +
                super.toString() +
                "\nPrestação de Serviços" +
                "\nInicio do Contrato: " + inicioContrato +
                "\nFim do Contrato: " + fimContrato;
    }

}
