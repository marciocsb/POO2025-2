package br.ufpb.dcx.amigosecreto;

public class AmigoInexistenteException extends RuntimeException {
    public AmigoInexistenteException(String message) {
        super(message);
    }
}
