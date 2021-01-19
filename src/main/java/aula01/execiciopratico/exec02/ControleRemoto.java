package aula01.execiciopratico.exec02;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ControleRemoto {

    public void controlaVolume(TipoControle tipoControle, Televisao televisao){
        Integer volume = televisao.getVolume();
        if(TipoControle.AUMENTAR.equals(tipoControle)) {

            volume = volume+1;

        } else {
            volume = volume-1;
        }

        televisao.setVolume(volume);
        mostraCanalEVolumeAtual(televisao);
    }

    public void trocaCanal(TipoControle tipoControle, Televisao televisao) {
        Integer canal = televisao.getCanal();
        if(TipoControle.AUMENTAR.equals(tipoControle)) {

            canal = canal+1;

        } else {
            canal = canal-1;
        }

        televisao.setCanal(canal);
        mostraCanalEVolumeAtual(televisao);
    }

    public void mudaCanalPara(Integer canal, Televisao televisao) {
        televisao.setCanal(canal);
        mostraCanalEVolumeAtual(televisao);
    }

    public void mostraCanalEVolumeAtual(Televisao televisao) {
        System.out.println(televisao.toString());
    }
}
