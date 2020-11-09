package interfaces.src;

public class Programa implements FormaGeometrica {
    public Programa() {
    }

    @Override
    public Circulo montaCirculo() {
        return new Circulo(10L);
    }

    @Override
    public Quadrado montaQuadrado() {
        return new Quadrado(30L);
    }
}
