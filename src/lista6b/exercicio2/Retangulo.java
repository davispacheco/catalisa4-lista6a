package src.lista6b.exercicio2;

public class Retangulo implements FiguraGeometrica {
    private double baseDoRetangulo;
    private double alturaDoRetangulo;

    public Retangulo() {
        this.baseDoRetangulo = 0;
        this.alturaDoRetangulo = 0;
    }

    public double getBaseDoRetangulo() {
        return baseDoRetangulo;
    }

    public void setBaseDoRetangulo(double baseDoRetangulo) {
        this.baseDoRetangulo = baseDoRetangulo;
    }

    public double getAlturaDoRetangulo() {
        return alturaDoRetangulo;
    }

    public void setAlturaDoRetangulo(double alturaDoRetangulo) {
        this.alturaDoRetangulo = alturaDoRetangulo;
    }

    @Override
    public void area() {
        areaFigura = baseDoRetangulo * alturaDoRetangulo;
    }
}
