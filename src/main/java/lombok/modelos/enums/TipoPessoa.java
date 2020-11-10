package lombok.modelos.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.exceptions.TipoPessoaException;

@Getter
@AllArgsConstructor
public enum TipoPessoa {

    PESSOA_FISICA(1, "PESSOA_FISICA"),
    PESSOA_JURIDICA(2, "PESSOA_JURIDICA");

    private int cod;
    private String descricao;


    public static TipoPessoa toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        for (TipoPessoa x : TipoPessoa.values()) {
            if (id.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido " + id);
    }

    public static TipoPessoa toEnum(String codEnum) {

        for (TipoPessoa value : TipoPessoa.values()) {
            if(value.getDescricao().equalsIgnoreCase(codEnum)) {
                return value;
            }
        }

        throw new TipoPessoaException("Tipo pessoa inválida ou não cadastrada " + codEnum);
    }

}
