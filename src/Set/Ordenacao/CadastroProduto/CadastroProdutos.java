package Set.Ordenacao.CadastroProduto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void addProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutos() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);

        return produtosPorPreco;
    }


    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.addProduto(1233,"Placa de Video", 200.00, 12);
        cadastroProdutos.addProduto(1111,"Computador Gamer", 2020.00, 11);
        cadastroProdutos.addProduto(1233,"Processador", 100.00, 100);
        cadastroProdutos.addProduto(1211,"Memoria ram DRR4", 80.00, 200);
        cadastroProdutos.addProduto(1311,"Fonte 550W", 110.00, 98);
        cadastroProdutos.addProduto(1311,"Fonte 650W", 109.00, 12);


        System.out.println(cadastroProdutos.exibirProdutos());
        System.out.println(cadastroProdutos.exibirPorPreco());
    }


}
