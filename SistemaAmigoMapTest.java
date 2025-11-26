package br.ufpb.dcx.AmigoSecreto;

public class SistemaAmigoMapTest {

    public static void main(String[] args) {
        SistemaAmigoMap sistema = new SistemaAmigoMap();
        sistema.cadastraAmigo("Ana", "ana@gmail.com");
        Amigo a = sistema.pesquisa("ana@gmail.com");
        if (a != null)
            System.out.println("Encontrado: " + a.getNome());
        else
            System.out.println("Não encontrado.");
    }
}