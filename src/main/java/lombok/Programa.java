package lombok;

import lombok.modelos.Pessoa;
import lombok.modelos.enums.TipoPessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Programa {

    public static void main(String[] args){

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("10/12/2000",format);

        Pessoa pessoa = new Pessoa("Guilherme", dataNascimento, 175);

        Pessoa pessoaComTipoPessoa = new Pessoa("Guilherme", LocalDate.now(), 175, TipoPessoa.PESSOA_JURIDICA);

        System.out.println(pessoa);
        System.out.println(pessoaComTipoPessoa);
    }
}
