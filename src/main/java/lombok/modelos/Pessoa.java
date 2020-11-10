package lombok.modelos;

import lombok.*;
import lombok.modelos.enums.TipoPessoa;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Integer altura;
    private TipoPessoa tipoPessoa;


    public Pessoa(String nome, LocalDate dataNascimento, Integer altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.tipoPessoa = TipoPessoa.PESSOA_FISICA;
    }


    public Integer calculaIdade(){
        return LocalDate.now().compareTo(this.dataNascimento);
    }

    public Integer getTipoPessoa() {
        return tipoPessoa.getCod();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", altura=" + altura +
                ", tipoPessoa=" + getTipoPessoa() +
                ", idade=" + calculaIdade() +
                '}';
    }
}
