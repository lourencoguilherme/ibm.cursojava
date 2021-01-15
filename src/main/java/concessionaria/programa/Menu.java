package concessionaria.programa;

import java.util.Scanner;

public class Menu {

    public static Concessionaria concessionaria = new Concessionaria();

    public static void main(String[] args) {

        Boolean sairDoPrograma = Boolean.FALSE;

        while (Boolean.FALSE.equals(sairDoPrograma)) {
            System.out.println("Selecione a opção desejada:");
            System.out.println("[1] para carro\n[2] caminhão:\n[3] sair:");

            Scanner teclado = new Scanner(System.in);

            Integer opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    concessionaria.controladorDeCarros();
                    break;
                case 2:
                    concessionaria.controladorDeCaminhoes();
                    break;
                case 3:
                    sairDoPrograma = Boolean.TRUE;
                    break;
            }
        }




    }


}
