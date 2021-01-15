package concessionaria.modelo;


public class Carro extends PropriedadeAutomovel {

    public Carro(Integer quantidadePortas, String marca, Integer anoFabricacao) {

        super(quantidadePortas, marca, anoFabricacao);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "quantidadePortas=" + getQuantidadePortas() +
                ", marca='" + getMarca() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                '}';
    }

}
