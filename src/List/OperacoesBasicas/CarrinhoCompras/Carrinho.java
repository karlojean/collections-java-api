package List.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> listaItem;

    public Carrinho() {
        this.listaItem = new ArrayList<>();
    }

    public void addItem(String nome, double preco, int quantidade) {
        this.listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i : listaItem) {
            if(i.getName().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        listaItem.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0;

        for(Item i : listaItem) {
            total += i.getPreco() * i.getQuantidade();
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(listaItem);
    }

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        carrinho.addItem("Placa de video", 1000, 2);
        carrinho.addItem("Memoria ram ddr4 3200mhz", 200, 4);
        carrinho.addItem("Sdd Nvme M.2 512gb", 350, 3);

        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotal());
        carrinho.exibirItens();

        carrinho.removeItem("Placa de video");

        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotal());
        carrinho.exibirItens();
    }

}
