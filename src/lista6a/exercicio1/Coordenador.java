package src.lista6a.exercicio1;

public class Coordenador extends Funcionario {
    private int professoresSupervisionados;

    public Coordenador() {
        this.professoresSupervisionados = 0;
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public void aumentoSalario() {
        double percentual = 0.05;
        double reajuste = salario * percentual;
        setSalario(getSalario() + reajuste);
    }

    public void adicionaProfessor() {
        if (professoresSupervisionados == 10) {
            System.out.println("Limite de professores supervisionados excedido.");
        } else {
            professoresSupervisionados++;
        }
    }
}
