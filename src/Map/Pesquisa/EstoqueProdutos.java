package Map.Pesquisa;

import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void addProduto(long cod, String nome, double preco, int quantidade) {
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirEstoque() {
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque() {
        double estoqueTotal = 0;

        if(!estoqueMap.isEmpty()) {
            for(Produto p : estoqueMap.values()) {
                estoqueTotal += p.getQuantidade() * p.getPreco();
            }
        }

        return estoqueTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produto = null;
        double maiorValor = Double.MIN_VALUE;

        if(!estoqueMap.isEmpty()) {
            for(Produto p : estoqueMap.values()) {
                if(p.getPreco() > maiorValor) {
                    produto = p;
                    maiorValor = p.getPreco();
                }
            }
        }

        return  produto;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produto = null;
        double menorValor = Double.MAX_VALUE;

        if(!estoqueMap.isEmpty()) {
            for(Produto p : estoqueMap.values()) {
                if(p.getPreco() < menorValor) {
                    produto = p;
                    menorValor = p.getPreco();
                }
            }
        }

        return  produto;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.addProduto(123, "Placa de video", 1222.91, 12);
        estoque.addProduto(1211, "Processador", 600, 111);
        estoque.addProduto(771, "Memoria Ram DDR4 16GB", 200, 200);

        estoque.exibirEstoque();

        System.out.println(estoque.calcularValorTotalEstoque());

        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.obterProdutoMaisBarato());
    }
}
