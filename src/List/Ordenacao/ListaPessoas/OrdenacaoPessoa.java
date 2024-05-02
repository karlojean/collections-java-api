package List.Ordenacao.ListaPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoa() {
        this.listaPessoa = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura) {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.addPessoa("Pedro", 32, 1.70);
        ordenacaoPessoa.addPessoa("Claudia", 19, 1.65);
        ordenacaoPessoa.addPessoa("Lucia", 29, 1.72);
        ordenacaoPessoa.addPessoa("Petter", 18, 1.64);

        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
