package src.lista6b.exercicio2;

public class Quadrado implements FiguraGeometrica {
    private double ladoDoQuadrado;

    public Quadrado() {
        this.ladoDoQuadrado = 0;
    }

    public double getLadoDoQuadrado() {
        return ladoDoQuadrado;
    }

    public void setLadoDoQuadrado(double ladoDoQuadrado) {
        this.ladoDoQuadrado = ladoDoQuadrado;
    }

    @Override
    public void area() {
areaFigura = ladoDoQuadrado * ladoDoQuadrado;
    }
}
