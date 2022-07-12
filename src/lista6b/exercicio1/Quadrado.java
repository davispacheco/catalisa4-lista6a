package src.lista6b.exercicio1;

public class Quadrado extends FiguraGeometrica {
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
setAreaFigura(ladoDoQuadrado * ladoDoQuadrado);
    }
}
