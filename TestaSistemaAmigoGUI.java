package br.ufpb.dcx.AmigoSecreto;
import java.util.Scanner;

public class TestaSistemaAmigoGUI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaAmigo sistema = new SistemaAmigo();
        System.out.print("Quantidade de amigos: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            sistema.cadastraAmigo(nome, email);
        }

        System.out.println("\n---- SORTEIO ----");
        for (int i = 0; i < qtd; i++) {
            System.out.print("Email da pessoa: ");
            String p = sc.nextLine();
            System.out.print("Email sorteado: ");
            String s = sc.nextLine();

            try {
                sistema.configuraAmigoSecretoDe(p, s);
            } catch (AmigoInexistenteException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nEnvio de mensagem para todos:");
        System.out.print("Remetente: ");
        String rem = sc.nextLine();
        System.out.print("Texto: ");
        String txt = sc.nextLine();

        System.out.print("É anônima? (true/false): ");
        boolean anon = sc.nextBoolean();
        MensagemParaTodos m = new MensagemParaTodos(txt, rem, anon);
        sistema.enviaMensagem(m);
        System.out.println("Mensagem enviada com sucesso!");
    }
}