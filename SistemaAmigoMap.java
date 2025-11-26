package br.ufpb.dcx.AmigoSecreto;
import java.util.HashMap;
import java.util.Map;

public class SistemaAmigoMap {
    private Map<String, Amigo> mapaAmigos = new HashMap<>();
    public void cadastraAmigo(String nome, String email) {
        mapaAmigos.put(email, new Amigo(nome, email));
    }

    public Amigo pesquisa(String email) {
        return mapaAmigos.get(email);
    }
}