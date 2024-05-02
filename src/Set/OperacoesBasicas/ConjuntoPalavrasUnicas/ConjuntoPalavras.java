package Set.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {
    private Set<String> conjuntoPalavrasSet;

    public ConjuntoPalavras() {
        this.conjuntoPalavrasSet = new HashSet<>();
    }

    public void addPalavra(String palavra) {
        conjuntoPalavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!conjuntoPalavrasSet.isEmpty() && conjuntoPalavrasSet.contains(palavra)){
            conjuntoPalavrasSet.remove(palavra);
        }
    }

    public boolean verificarPalavra(String palavra) {
        if(!conjuntoPalavrasSet.isEmpty()){
            if (conjuntoPalavrasSet.contains(palavra)) {
                return true;
            }
        }

        return false;
    }

    public void exibirPalavras() {
        System.out.println(conjuntoPalavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();

        conjuntoPalavras.addPalavra("Macarrão");
        conjuntoPalavras.addPalavra("Arroz");

        conjuntoPalavras.exibirPalavras();

        conjuntoPalavras.removerPalavra("Arroz");

        conjuntoPalavras.exibirPalavras();

        System.out.println("A palavra Arroz está presente: " + conjuntoPalavras.verificarPalavra("Arroz"));
        System.out.println("A palavra Macarrão está presente: " + conjuntoPalavras.verificarPalavra("Macarrão"));
    }
}
