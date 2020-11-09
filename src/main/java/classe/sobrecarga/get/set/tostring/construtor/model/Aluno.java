package classe.sobrecarga.get.set.tostring.construtor.model;

public class Aluno {

    private String nome;
    private Integer idade;
    private String matricula;
    private Long cpf;

    public Aluno() {
    }

    public Aluno(String nome, Integer idade, String matricula, Long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    //Sobrecarga
    public Aluno(String nome, String idade, String matricula, String cpf) {
        this.nome = nome;
        this.idade = Integer.parseInt(idade);
        this.matricula = matricula;
        this.cpf = Long.parseLong(cpf);
    }

    //Sobrecarga
    public Aluno(String nome, Object idade, String matricula, Object cpf) {
        this.nome = nome;
        if(idade instanceof String) {
            this.idade = Integer.parseInt(idade.toString());
        }


        this.matricula = matricula;

        if(cpf instanceof String) {
            this.cpf = Long.parseLong(cpf.toString());
        }


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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno cadastrado com sucesso: " +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", matricula: '" + matricula + '\'' +
                ", cpf: " + cpf +
                '.';
    }
}
