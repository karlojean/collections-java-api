package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void addPalavras(String palavra, int contagem) {
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemMap.isEmpty()) {
            contagemMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.addPalavras("Sempre", 12);
        contagemPalavras.addPalavras("Carro", 2);
        contagemPalavras.addPalavras("Andar", 21);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Andar");

        contagemPalavras.exibirContagemPalavras();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

    }


}
