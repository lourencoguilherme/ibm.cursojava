package lombok.exceptions;

public class TipoPessoaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TipoPessoaException(String msg){
        super(msg);
    }

    public TipoPessoaException(String msg, Throwable cause){
        super(msg, cause);
    }
}
