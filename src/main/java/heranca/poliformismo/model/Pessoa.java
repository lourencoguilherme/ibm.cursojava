package heranca.poliformismo.model;

public class Pessoa extends Idade {
    private String nome;
    private Integer idade;
    private Long cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, Long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa: " +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", cpf : '" + cpf + '\'' +
                '.';
    }

    @Override
    public void somaIdadeUmAno() {
        this.idade = idade+1;
    }

    @Override
    public void somaIdade(Integer quantidadeDeAnos) {

    }
}
