package aula01.concessionaria;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Carro {

    private String nome;
    private String modelo;
    private Integer ano;

}
