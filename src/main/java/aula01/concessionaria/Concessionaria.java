package aula01.concessionaria;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@NoArgsConstructor
public class Concessionaria implements IConcessionaria {

    @Getter
    @Setter
    private Automovel automovel = new Automovel();


    @Override
    public void cadastrarCarro() {

        Scanner teclado = new Scanner(System.in);

        String nome;
        String modelo;
        Integer ano;

        System.out.println("Digite o nome: ");
        nome = teclado.next();

        System.out.println("Digite o modelo: ");
        modelo = teclado.next();

        System.out.println("Digite o ano: ");

        ano = teclado.nextInt();

        Carro carro = new Carro(nome, modelo, ano);

        this.automovel.getCarros().add(carro);


    }

    @Override
    public void listarCarro() {
        for (Carro carro : this.automovel.getCarros()) {
            System.out.println(carro);
        }
    }

    @Override
    public void cadastrarCaminhao() {
        Scanner teclado = new Scanner(System.in);

        String nome;
        String modelo;
        Integer ano;

        System.out.println("Digite o nome: ");
        nome = teclado.next();

        System.out.println("Digite o modelo: ");
        modelo = teclado.next();

        System.out.println("Digite o ano: ");

        ano = teclado.nextInt();

        Caminhao caminhao = new Caminhao(nome, modelo, ano);

        this.automovel.getCaminhoes().add(caminhao);
    }

    @Override
    public void listarCaminhao() {
        for (Caminhao caminhao : this.automovel.getCaminhoes()) {
            System.out.println(caminhao);
        }
    }
}
