package br.ufpb.dcx.AmigoSecreto;

public class MensagemParaTodos extends Mensagem {

    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
    }

    @Override
    public String getTextoCompletoAExibir() {
        if (isAnonima()) {
            return "Mensagem para todos. Texto: " + getTexto();
        } else {
            return "Mensagem de " + getEmailRemetente() +
                    " para todos. Texto: " + getTexto();
        }
    }
}