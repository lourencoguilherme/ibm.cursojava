package aula01.herenca;

public class ExecutaCargoBanco {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Guilherme", 20, 123123213321L);

        promoveGerente(funcionario);

        funcionario.setIdade(21);

        promoveGerente(funcionario);

    }

    public static void promoveGerente(Funcionario funcionario) {
        if(funcionario.getIdade() > 20) {
            Gerente gerente = new Gerente(funcionario);
            System.out.println("Parabéns você agora é um gerente");
            System.out.println(gerente.toString());
        } else {
            System.out.println("Você ainda não pode ser promovido pois precisa ser maior de 21 anos!");
        }
    }

}
