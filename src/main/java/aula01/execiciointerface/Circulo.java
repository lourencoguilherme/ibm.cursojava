package aula01.execiciointerface;

public class Circulo extends ContratoFormaGeometrica  implements FormaGeometrica {

    public Circulo(Integer area, Integer comprimento) {
        super(area, comprimento);
    }

    @Override
    public void exibeAreaEcomprimento() {
        System.out.println("Area do circulo é " + getArea() + " com comprimento de " + getComprimento());
    }
}
