package aula01.herenca;

public class Funcionario extends Pessoa {

    private Long cpf;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer idade, Long cpf) {
        setNome(nome);
        setIdade(idade);
        this.cpf = cpf;
    }


    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String pegaDadosFuncionario() {
        return "Funcionario" +
                " nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf=" + cpf;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                super.toString() +
                "cpf=" + cpf +
                '}';
    }
}
