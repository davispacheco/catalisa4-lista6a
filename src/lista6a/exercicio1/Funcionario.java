package src.lista6a.exercicio1;

public abstract class Funcionario implements Universidade {
    private String nome;
    private String cpf;
    private String numeroDeRegistro;
    private String orgaoDeLotacao;
    private double salario;

    public Funcionario() {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = 0;
    }

    public void aumentoSalario() {
        double percentual = 0.1;
        double reajuste = salario * percentual;
        salario += reajuste;
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

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
