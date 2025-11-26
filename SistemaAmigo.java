package br.ufpb.dcx.AmigoSecreto;
import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {

    private List<Amigo> amigos = new ArrayList<>();
    private List<Mensagem> mensagens = new ArrayList<>();
    public void cadastraAmigo(String nome, String email) {
        amigos.add(new Amigo(nome, email));
    }

    public void enviaMensagem(Mensagem m) {
        mensagens.add(m);
    }
    public List<Mensagem> pesquisaMensagensAnonimas() {
        List<Mensagem> resultado = new ArrayList<>();
        for (Mensagem m : mensagens) {
            if (m.isAnonima()) {
                resultado.add(m);
            }
        }
        return resultado;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        Amigo a = buscaAmigoPorEmail(emailDaPessoa);
        if (a == null) {
            throw new AmigoInexistenteException("Pessoa não encontrada!");
        }

        a.setEmailAmigoSecreto(emailAmigoSorteado);
    }
    private Amigo buscaAmigoPorEmail(String email) {
        for (Amigo a : amigos) {
            if (a.getEmail().equals(email)) return a;
        }
        return null;
    }
    public List<Mensagem> pesquisaTodasAsMensagens() {
        return mensagens;
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa)
            throws AmigoInexistenteException, AmigoNaoSorteadoException {

        Amigo a = buscaAmigoPorEmail(emailDaPessoa);

        if (a == null) throw new AmigoInexistenteException("Pessoa não existe!");

        if (a.getEmailAmigoSecreto() == null) throw new AmigoNaoSorteadoException("Amigo secreto ainda não foi sorteado!");

        return a.getEmailAmigoSecreto();
    }
}