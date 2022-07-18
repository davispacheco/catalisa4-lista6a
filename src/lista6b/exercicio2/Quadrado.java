package src.lista6b.exercicio2;

public class Quadrado implements FiguraGeometrica {
    private double ladoDoQuadrado;
    private double areaQuadrado;

    public Quadrado(double ladoDoQuadrado) {
        this.ladoDoQuadrado = ladoDoQuadrado;
        this.areaQuadrado = getAreaQuadrado();
    }

    public double getLadoDoQuadrado() {
        return ladoDoQuadrado;
    }

    public void setLadoDoQuadrado(double ladoDoQuadrado) {
        this.ladoDoQuadrado = ladoDoQuadrado;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    @Override
    public void calcularArea() {
        areaQuadrado = ladoDoQuadrado * ladoDoQuadrado;
    }
}
