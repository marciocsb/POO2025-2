package br.ufpb.dcx.AmigoSecreto;

public class Amigo {
    private String nome;
    private String email;
    private String emailAmigoSecreto;

    public Amigo(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.emailAmigoSecreto = null;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailAmigoSecreto() {
        return emailAmigoSecreto;
    }

    public void setEmailAmigoSecreto(String emailAmigoSecreto) {
        this.emailAmigoSecreto = emailAmigoSecreto;
    }
}
