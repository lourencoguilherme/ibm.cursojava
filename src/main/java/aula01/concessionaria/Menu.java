package aula01.concessionaria;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Scanner;

@NoArgsConstructor
public class Menu {

    public void menuAutomovel() {
        Boolean sairDoSistema = Boolean.FALSE;
        Concessionaria concessionaria = new Concessionaria();


        while (Boolean.FALSE.equals(sairDoSistema) ) {
            System.out.println("Para cadastrar carro 1");
            System.out.println("Para cadastrar caminhão 2");
            System.out.println("Para listar carro 3");
            System.out.println("Para listar caminhão 4");
            System.out.println("Para sair 5");

            Scanner teclado = new Scanner(System.in);

            Integer numeroDigitado = teclado.nextInt();


            if(numeroDigitado.equals(1)) {
                concessionaria.cadastrarCarro();
            } else if(numeroDigitado.equals(2)) {
                concessionaria.cadastrarCaminhao();
            } else if(numeroDigitado.equals(3)) {
                concessionaria.listarCarro();
            } else if(numeroDigitado.equals(4)) {
                concessionaria.listarCaminhao();
            } else if(numeroDigitado.equals(5)) {
                sairDoSistema = Boolean.TRUE;
            }

        }
    }

}
