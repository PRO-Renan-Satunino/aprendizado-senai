package atvd14;

public abstract class Funcionario extends Fisica {

    String cpf;
    String rg;
    String matricula;
    Setor setor;
    double salario;

    public Funcionario(String nome, String telefone, String email, Endereco endereco, Sexo sexo,
            EstadoCivil estadoCivil, String dataNascimento, String cpf, String rg, String matricula, Setor setor,
            double salario) {
        super(nome, telefone, email, endereco, sexo, estadoCivil, dataNascimento);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
