package heranca.poliformismo;

import heranca.poliformismo.model.Aluno;
import heranca.poliformismo.model.Professor;

public class Programa {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf(123123213L);
        professor.setIdade(12);
        professor.setNome("Teste");

        System.out.println(professor);

        Professor professor1 = new Professor("nome", 1, 123L);

        professor1.somaIdadeUmAno();

        System.out.println(professor1);

        Aluno aluno = new Aluno("nome", 1, "matricula", 1L);


        System.out.println(aluno);

    }
}
