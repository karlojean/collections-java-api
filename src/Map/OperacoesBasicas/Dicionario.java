package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void addPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirDicionario() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = null;

        if(!dicionarioMap.isEmpty()) {
            definicao = dicionarioMap.remove(palavra);
        }

        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.addPalavra("Carro", "Algo que anda sobre 4 rodas");
        dicionario.addPalavra("Moto", "Algo que anda sobre 2 rodas");
        dicionario.addPalavra("Cachorro", "Animal de quatro patas");
        dicionario.addPalavra("Computador", "Maquina que computa");

        dicionario.exibirDicionario();

        dicionario.removerPalavra("Cachorro");

        dicionario.exibirDicionario();

        System.out.println(dicionario.pesquisarPorPalavra("Computador"));
    }
}
