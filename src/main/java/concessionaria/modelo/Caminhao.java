package concessionaria.modelo;

public class Caminhao extends PropriedadeAutomovel {
    public Caminhao(Integer quantidadePortas, String marca, Integer anoFabricacao) {
        super(quantidadePortas, marca, anoFabricacao);
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "quantidadePortas=" + getQuantidadePortas() +
                ", marca='" + getMarca() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                '}';
    }
}
