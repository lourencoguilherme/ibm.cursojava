package aula01.concessionaria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Automovel {

    private List<Carro> carros = new ArrayList<>();
    private List<Caminhao> caminhoes = new ArrayList<>();

}
