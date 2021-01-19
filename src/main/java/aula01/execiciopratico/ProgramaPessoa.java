package aula01.execiciopratico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaPessoa {

    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("10/12/2000",format);


        Pessoa pessoa = new Pessoa("Guilherme", dataNascimento, 1.17f, TipoPessoa.PESSOA_FISICA);

        pessoa.mostraDadosPessoa();

        Pessoa pessoa1 = new Pessoa();

        LocalDate dataNascimento2 = LocalDate.parse("10/12/2010",format);


        pessoa1.setDataNascimento(dataNascimento2);
        pessoa1.setNome("Pedro");
        pessoa1.setAltura(12.3f);
        pessoa1.setTipoPessoa(TipoPessoa.PESSOA_JURIDICA);

        pessoa1.mostraDadosPessoa();

        Pessoa pessoa2 = new Pessoa.PessoaBuilder()
                .tipoPessoa(TipoPessoa.PESSOA_JURIDICA)
                .altura(20.4f)
                .dataNascimento(LocalDate.now())
                .idade(12)
                .nome("Nome builder")
                .build();

        pessoa2.mostraDadosPessoa();

    }
}
