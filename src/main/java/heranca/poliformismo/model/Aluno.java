package heranca.poliformismo.model;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, Integer idade, String matricula, Long cpf) {
        super(nome, idade, cpf);
        this.matricula = matricula;

        setNome(nome);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "nome: '" + getNome() + '\'' +
                ", idade: " + getIdade() +
                ", cpf : '" + getCpf() + '\'' +
                ", matricula : '" + getMatricula() + '\'' +
                '.';
    }

    @Override
    public void somaIdadeUmAno() {
        Integer idade = getIdade();

        idade=idade+5;

        setIdade(idade);
    }
}
