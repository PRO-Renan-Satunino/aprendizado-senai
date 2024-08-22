package atvd14;

public class Saude extends Funcionario {
    String crm;

    public Saude(String nome, String telefone, String email, Endereco endereco, Sexo sexo, EstadoCivil estadoCivil,
            String dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String crm) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCRM: " + crm +
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
