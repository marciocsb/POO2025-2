package br.ufpb.dcx.AmigoSecreto;
public abstract class Mensagem {

    private String texto;
    private String emailRemetente;
    private boolean anonima;

    public Mensagem(String texto, String emailRemetente, boolean anonima) {
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;
    }
    public String getTexto() {
        return texto;
    }
    public String getEmailRemetente() {
        return emailRemetente;
    }
    public boolean isAnonima() {
        return anonima;
    }
    public abstract String getTextoCompletoAExibir();
}