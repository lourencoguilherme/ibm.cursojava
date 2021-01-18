package old;

public class Quadrado implements FormaGeometrica {

    private Integer area;
    private Integer comprimento;

    public Quadrado() {
    }

    public Quadrado(Integer area, Integer comprimento) {
        this.area = area;
        this.comprimento = comprimento;
    }

    @Override
    public void mostraAreaEComprimento() {
        System.out.println("Área: " + this.area+ " Comprimento: " + this.comprimento);
    }

}
