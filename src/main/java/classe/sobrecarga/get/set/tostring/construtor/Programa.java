package classe.sobrecarga.get.set.tostring.construtor;

import classe.sobrecarga.get.set.tostring.construtor.model.Aluno;

public class Programa {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Guilherme");
        aluno.setCpf(397714519333L);
        aluno.setIdade(29);
        aluno.setMatricula("DSAFJFH22222");

        System.out.println(aluno);

        int idade =  aluno.getIdade();
        idade = idade+1;

        System.out.println("Idade nova: " + idade);

        aluno.setIdade(idade);

        System.out.println(aluno);

        Aluno alunoAgatha = new Aluno("Agatha",1,"1",13212313L);

        System.out.println(alunoAgatha);

        Aluno alunoAgathaComString = new Aluno("Agatha","1111","1","132123131");

        System.out.println(alunoAgathaComString);


        Object cpfObjeto = "132123131";
        Object idadeObjeto = "2";

        Aluno alunoAgathaComObject = new Aluno("Agatha",idadeObjeto,"1",cpfObjeto);

        System.out.println(alunoAgathaComObject);


        Object cpfObjetoNull = null;
        Object idadeObjetoNull = null;

        Aluno alunoAgathaComObjectNull = new Aluno("Agatha",cpfObjetoNull,"1",idadeObjetoNull);

        System.out.println(alunoAgathaComObjectNull);


    }
}
