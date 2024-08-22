package atvd14;

public class Juridico extends Funcionario {
    String oab;

    public Juridico(String nome, String telefone, String email, Endereco endereco, Sexo sexo, EstadoCivil estadoCivil,
            String dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String oab) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nOAB: " + oab +
                "\nSexo: " + sexo.getTexto() +
                "\nTelefone: " + telefone +
                "\nCPF: " + cpf +
                "\nEstado Civil: " + estadoCivil.getTexto() +
                "\nRG: " + rg +
                "\nEmail: " + email +
                "\nMatricula: " + matricula +
                "\nData de Nascimento: " + dataNascimento +
                "\nEndereço: " + endereco +
                "\nSetor: " + setor.getTexto() +
                "\nSalario: " + salario;
    }

}
