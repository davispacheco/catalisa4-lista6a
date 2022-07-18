package src.lista6b.exercicio1;

public class Retangulo extends FiguraGeometrica {
    private double baseDoRetangulo;
    private double alturaDoRetangulo;

    public Retangulo(double baseDoRetangulo, double alturaDoRetangulo) {
        this.baseDoRetangulo = 0;
        this.alturaDoRetangulo = 0;
    }

    @Override
    public void calcularArea() {
        setAreaFigura(baseDoRetangulo * alturaDoRetangulo);
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
}
