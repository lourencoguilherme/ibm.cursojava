package aula01.execiciopratico.exec01;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Float altura;
    private TipoPessoa tipoPessoa;
    private Integer idade;

    public Pessoa(String nome, LocalDate dataNascimento, Float altura, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.tipoPessoa = tipoPessoa;

    }

    public void mostraDadosPessoa() {
        this.idade = calcularIdade();
        System.out.println(this.toString());
    }

    public Integer calcularIdade() {
        try{
            return LocalDate.now().compareTo(this.getDataNascimento());
        }catch (NullPointerException ex) {
            System.out.println("Idade da pessoa ainda não foi informada!");

            return 0;
        }

    }


}
