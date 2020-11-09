package interfaces.src;

public class Quadrado {

    private Long comprimento;

    public Quadrado() {
    }

    public Quadrado(Long comprimento) {
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
        return "Quadrado{" +
                "comprimento=" + comprimento +
                '}';
    }
}
