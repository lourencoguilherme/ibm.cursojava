package aula01.execiciointerface;

public class ExecutaFormaGeometrica {

    public static void main(String[] args) {
        FormaGeometrica quadrado = new Quadrado(10, 30);
        FormaGeometrica circulo = new Circulo(200, 34);

        quadrado.exibeAreaEcomprimento();
        circulo.exibeAreaEcomprimento();
    }
}
