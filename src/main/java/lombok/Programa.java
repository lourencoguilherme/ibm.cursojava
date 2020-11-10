package lombok;

import lombok.exceptions.TipoPessoaException;
import lombok.modelos.Pessoa;
import lombok.modelos.enums.TipoPessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){
//        aula01();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tipo Pessoa(PESSOA_JURIDICA, PESSOA_FISICA): ");

        String tipoPessoaString = teclado.next();

        try{
            TipoPessoa tipoPessoaEnum = TipoPessoa.toEnum(tipoPessoaString);

            System.out.println("Tipo Pessoa: " + tipoPessoaEnum);
        } catch (TipoPessoaException ex) {
//            System.out.println("Tipo pessoa inválida ou não cadastrada " + tipoPessoaString);
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Desculpe tente novamente ou revise os dados do Tipo Pessoa!!!");
        }



    }


    public static void aula01() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("10/12/2000",format);

        Pessoa pessoa = new Pessoa("Guilherme", dataNascimento, 175);

        Pessoa pessoaComTipoPessoa = new Pessoa("Guilherme", LocalDate.now(), 175, TipoPessoa.PESSOA_JURIDICA);

        System.out.println(pessoa);
        System.out.println(pessoaComTipoPessoa);
    }
}
