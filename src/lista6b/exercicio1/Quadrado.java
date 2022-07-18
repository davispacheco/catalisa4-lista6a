package src.lista6b.exercicio1;

public class Quadrado extends FiguraGeometrica {
    private double ladoDoQuadrado;

    public Quadrado(double ladoDoQuadrado) {
        this.ladoDoQuadrado = ladoDoQuadrado;
    }

    @Override
    public void calcularArea() {
        setAreaFigura(ladoDoQuadrado * ladoDoQuadrado);
    }

    public double getLadoDoQuadrado() {
        return ladoDoQuadrado;
    }

    public void setLadoDoQuadrado(double ladoDoQuadrado) {
        this.ladoDoQuadrado = ladoDoQuadrado;
    }
}
