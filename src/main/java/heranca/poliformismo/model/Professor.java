package heranca.poliformismo.model;

public class Professor extends Pessoa {
    public Professor() {
    }

    public Professor(String nome, Integer idade, Long cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public String toString() {
        return "Professor: " +
                "nome: '" + getNome() + '\'' +
                ", idade: " + getIdade() +
                ", cpf : '" + getCpf() + '\'' +
                '.';
    }

    //poliformismo
    @Override
    public void somaIdadeUmAno() {
        super.somaIdadeUmAno();
    }

    @Override
    public void somaIdade(Integer quantidadeDeAnos) {
        super.somaIdade(quantidadeDeAnos);
    }

    public void somaIdade(Object quantidadeDeAnos) {
        if(quantidadeDeAnos instanceof Integer) {
            super.somaIdade(Integer.parseInt(quantidadeDeAnos.toString()));
        }
    }

}
