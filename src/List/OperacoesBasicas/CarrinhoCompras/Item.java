package List.OperacoesBasicas.CarrinhoCompras;

public class Item {
    private String name;
    private double preco;
    private int quantidade;

    public Item(String name, double preco, int quantidade) {
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", total= R$" + preco * quantidade +
                '}';
    }
}
