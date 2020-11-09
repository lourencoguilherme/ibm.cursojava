package interfaces.src;

public class Circulo {

    private Long comprimento;

    public Circulo() {
    }

    public Circulo(Long comprimento) {
        this.comprimento = comprimento;
    }

    public Long getComprimento() {
        return comprimento;
    }

    public void setComprimento(Long comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "comprimento=" + comprimento +
                '}';
    }
}
