package br.ufpb.dcx.amigosecreto;

public class SistemaAmigo {

    public List<Mensagem> pesquisaMensagensAnonimas() {
        //TODO: FAZER DEPOIS
        return null;

    }



    //Método que pesquisa as mensagens que são anônimas e retorna uma lista com tais mensagens.
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{…} // Método que configura o amigo secreto sorteado para a pessoa cujo e-mail é “emailDaPessoa”, atribuindo-lhe seu  // amigo secreto como sendo a pessoa de e-mail “emailAmigoSorteado”. Caso não exista pessoa cadastrada no sistema  // com o e-mail “emailDaPessoa, deve ser lançada a exceção “AmigoInexistenteException”.
    public List<Mensagem> pesquisaTodasAsMensagens(){
//Método que pesquisa todas as mensagens já enviadas.
        public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException{…}
// Método que pesquisa o e-mail do amigo secreto sorteado para a pessoa cujo e-mail é “emailDaPessoa”
// Caso não exista pessoa cadastrada no sistema com o e-mail “emailDaPessoa”, deve ser lançada a exceção
        // “AmigoInexistenteException”. Caso exista a pessoa com esse e-mail, mas o seu amigo secreto sorteado
// ainda não tenha sido configurado (o e-mail do amigo sorteado é null), deve ser lançada a exceção
// “AmigoNaoSorteadoException”.

