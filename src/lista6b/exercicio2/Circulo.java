package src.lista6b.exercicio2;

public class Circulo implements FiguraGeometrica {
    private double pi;
    private double raio;
    private double areaCirculo;

    public Circulo() {
        this.pi = 3.14;
        this.raio = 0;
        this.areaCirculo = 0;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }

    public void setAreaCirculo(double areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

    @Override
    public void calculoArea() {
        areaCirculo = pi * raio * raio;
    }
}
