package aula01.execiciopratico.exec02;

public class TelevisaoOn {

    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();

        Televisao televisao = new Televisao(0 ,0);

        controleRemoto.controlaVolume(TipoControle.AUMENTAR, televisao);

        controleRemoto.mudaCanalPara(145, televisao);

        controleRemoto.controlaVolume(TipoControle.DIMINUIR, televisao);

        controleRemoto.trocaCanal(TipoControle.DIMINUIR, televisao);

    }
}
