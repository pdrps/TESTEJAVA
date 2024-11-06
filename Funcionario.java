public class Funcionario {

    private int salarioBase;
    private int horasExtrasTrabalhadas;
    private String nome;
    private String cpf;


public double calculaSalario(){
    double salario = salarioBase +(horasExtrasTrabalhadas*(salarioBase/160));
    return salario;
}

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtrasTrabalhadas() {
        return horasExtrasTrabalhadas;
    }

    public void setHorasExtrasTrabalhadas(int horasExtrasTrabalhadas) {
        this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}