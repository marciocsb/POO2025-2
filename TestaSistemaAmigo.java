package br.ufpb.dcx.AmigoSecreto;

public class TestaSistemaAmigo {
    public static void main(String[] args) {

        SistemaAmigo sistema = new SistemaAmigo();
        sistema.cadastraAmigo("José", "jose@email.com");
        sistema.cadastraAmigo("Maria", "maria@email.com");

        try {
            sistema.configuraAmigoSecretoDe("jose@email.com", "maria@email.com");
            sistema.configuraAmigoSecretoDe("maria@email.com", "jose@email.com");
        } catch (AmigoInexistenteException e) {
            System.out.println(e.getMessage());
        }

        MensagemParaAlguem msg1 = new MensagemParaAlguem("Oi José!", "maria@email.com", true, "jose@email.com");sistema.enviaMensagem(msg1);

        MensagemParaTodos msg2 = new MensagemParaTodos("Boa sorte a todos!", "maria@email.com", true);sistema.enviaMensagem(msg2);

        System.out.println("Mensagens anônimas:");
        for (Mensagem m : sistema.pesquisaMensagensAnonimas()) {
            System.out.println(m.getTextoCompletoAExibir());
        }

        try {
            String amigoDeJose = sistema.pesquisaAmigoSecretoDe("jose@email.com");
            if (amigoDeJose.equals("maria@email.com")) {
                System.out.println("Ok");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}