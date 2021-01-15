package concessionaria.programa;

import concessionaria.modelo.Automovel;
import concessionaria.modelo.Caminhao;
import concessionaria.modelo.Carro;

import java.util.Scanner;

public class Concessionaria implements ConcessionariaInterface {

    public Automovel automovel = new Automovel();

    @Override
    public void controladorDeCarros() {

        Boolean voltar = Boolean.FALSE;

        while (Boolean.FALSE.equals(voltar)) {
            System.out.println("Selecione a opção desejada:");
            System.out.println("[1] para cadastrar carro\n[2] para listar carros:\n[3] para voltar: ");

            Scanner teclado = new Scanner(System.in);

            Integer opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCarro();
                    break;
                case 2:
                    listarCarro();
                    break;
                case 3:
                    voltar = Boolean.TRUE;
                    break;
            }
        }



    }

    @Override
    public void controladorDeCaminhoes() {
        Boolean voltar = Boolean.FALSE;

        while (Boolean.FALSE.equals(voltar)) {
            System.out.println("Selecione a opção desejada:");
            System.out.println("[1] para cadastrar caminhao \n[2] para listar caminhoes:\n[3] para voltar: ");

            Scanner teclado = new Scanner(System.in);

            Integer opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCaminhao();
                    break;
                case 2:
                    listarCaminhao();
                    break;
                case 3:
                    voltar = Boolean.TRUE;
                    break;
            }
        }


    }


    public void cadastrarCarro() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade portas: ");

        Integer quantidadePortas = teclado.nextInt();

        System.out.println("Digite a marca: ");

        String marca = teclado.next();

        System.out.println("Digite a ano fabricacao: ");

        Integer anoFabricacao = teclado.nextInt();

        Carro carro = new Carro(quantidadePortas, marca, anoFabricacao);

        automovel.getCarros().add(carro);
    }

    public void cadastrarCaminhao() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade portas: ");

        Integer quantidadePortas = teclado.nextInt();

        System.out.println("Digite a marca: ");

        String marca = teclado.next();

        System.out.println("Digite a ano fabricacao: ");

        Integer anoFabricacao = teclado.nextInt();

        Caminhao caminhao = new Caminhao(quantidadePortas, marca, anoFabricacao);

        automovel.getCaminhoes().add(caminhao);
    }


    public void listarCaminhao() {
        System.out.println(automovel.getCaminhoes().toString());
    }


    public void listarCarro() {
        System.out.println(automovel.getCarros().toString());
    }
}
