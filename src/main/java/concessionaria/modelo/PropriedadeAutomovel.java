package concessionaria.modelo;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropriedadeAutomovel {

    private Integer quantidadePortas;
    private String marca;
    private Integer anoFabricacao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropriedadeAutomovel that = (PropriedadeAutomovel) o;
        return Objects.equals(quantidadePortas, that.quantidadePortas) &&
                Objects.equals(marca, that.marca) &&
                Objects.equals(anoFabricacao, that.anoFabricacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidadePortas, marca, anoFabricacao);
    }

    @Override
    public String toString() {
        return "PropriedadeAutomovel{" +
                "quantidadePortas=" + quantidadePortas +
                ", marca='" + marca + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
