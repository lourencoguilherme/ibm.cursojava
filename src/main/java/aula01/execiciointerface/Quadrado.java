package aula01.execiciointerface;

public class Quadrado extends ContratoFormaGeometrica implements FormaGeometrica {


    public Quadrado(Integer area, Integer comprimento) {
        super(area, comprimento);
    }

    @Override
    public void exibeAreaEcomprimento() {
        System.out.println("Area do quadrado é " + getArea() + " com comprimento de " + getComprimento());
    }
}
