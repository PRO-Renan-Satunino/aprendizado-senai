package atvd14;

public class Engenharia extends Funcionario {
    String crea;

    public Engenharia(String nome, String telefone, String email, Endereco endereco, Sexo sexo, EstadoCivil estadoCivil,
            String dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String crea) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCREA: " + crea +
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
