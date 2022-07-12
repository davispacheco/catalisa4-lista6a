package src.lista6b.exercicio1;

public class Circulo extends FiguraGeometrica {
    private double pi;
    private double raio;

    public Circulo() {
        this.pi = 3.14;
        this.raio = 0;
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

    @Override
    public void area() {
        setAreaFigura(pi * raio * raio);
    }
}
