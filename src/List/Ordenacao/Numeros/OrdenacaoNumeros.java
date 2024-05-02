package List.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void addNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaOrdenada = new ArrayList<>(this.listaNumeros);

        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaOrdenada = new ArrayList<>(this.listaNumeros);

        listaOrdenada.sort(Collections.reverseOrder());
        return listaOrdenada;
    }

    public void listarNumeros(){
        System.out.println(this.listaNumeros);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.addNumero(8);
        ordenacaoNumeros.addNumero(12);
        ordenacaoNumeros.addNumero(90);
        ordenacaoNumeros.addNumero(73);
        ordenacaoNumeros.addNumero(1);
        ordenacaoNumeros.addNumero(97);
        ordenacaoNumeros.addNumero(-89);
        ordenacaoNumeros.addNumero(123);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }
}
