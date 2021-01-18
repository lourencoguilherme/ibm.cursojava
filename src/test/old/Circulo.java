package old;

public class Circulo implements FormaGeometrica {

    private Integer area;
    private Integer comprimento;

    @Override
    public void mostraAreaEComprimento() {
        System.out.println("Área: " + this.area+ " Comprimento: " + this.comprimento);
    }
}
