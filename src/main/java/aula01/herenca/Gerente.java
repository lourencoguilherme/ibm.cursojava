package aula01.herenca;

public class Gerente extends Pessoa {

    private Long cpf;

    private String cargo;

    public Gerente(String nome, Integer idade, Long cpf) {
        setNome(nome);
        setIdade(idade);
        this.cpf = cpf;
    }

    public Gerente(String nome, Integer idade, Long cpf, String cargo) {
        setNome(nome);
        setIdade(idade);
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public Gerente(Funcionario funcionario) {
        setNome(funcionario.getNome());
        setIdade(funcionario.getIdade());
        this.cpf = funcionario.getCpf();
    }

    public Gerente(Pessoa pessoa){
        setNome(pessoa.getNome());
        setIdade(pessoa.getIdade());
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String pegaDadosGerente() {
        return "Gerente " +
                super.toString() +
                ", cpf=" + cpf;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() +
                "cpf=" + cpf +
                '}';
    }

    public void mostraDados(String nome) {
        System.out.println("O nome do Gerente é " + nome);
    }

    public void mostraDados(Integer idade) {
        System.out.println("A idade do gerente é " + idade);
    }



}
