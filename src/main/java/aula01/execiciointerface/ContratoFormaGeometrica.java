package aula01.execiciointerface;

public class ContratoFormaGeometrica {
    private Integer area;
    private Integer comprimento;

    public ContratoFormaGeometrica(Integer area, Integer comprimento) {
        this.area = area;
        this.comprimento = comprimento;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getComprimento() {
        return comprimento;
    }

    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }
}
