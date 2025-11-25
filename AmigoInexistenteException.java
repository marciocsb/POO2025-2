package br.ufpb.dxc.marcioAmigoSecreto;

public class AmigoInexistenteException extends RuntimeException {
    public AmigoInexistenteException(String message) {
        super(message);
    }
}
