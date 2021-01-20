package aula01.concessionaria;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Caminhao {
    private String nome;
    private String modelo;
    private Integer ano;
}
