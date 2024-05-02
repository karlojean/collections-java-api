package List.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class Soma {
    private List<Integer> listaNumeros;

    public Soma() {
        this.listaNumeros = new ArrayList<>();
    }

    public void addNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        for(int n : listaNumeros) {
            soma += n;
        }

        return soma;
    }

    public int maiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;

        for(int n : listaNumeros) {
            if(n > maiorNumero) {
                maiorNumero = n;
            }
        }

        return maiorNumero;
    }

    public int menorNumero() {
        int menorNumero = Integer.MAX_VALUE;

        for(int n : listaNumeros) {
            if(n < menorNumero) {
                menorNumero = n;
            }
        }

        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(this.listaNumeros);
    }

    public static void main(String[] args) {
        Soma soma = new Soma();

        soma.addNumero(4);
        soma.addNumero(12);
        soma.addNumero(2);
        soma.addNumero(98);
        soma.addNumero(-2);

        System.out.println(soma.calcularSoma());
        System.out.println(soma.maiorNumero());
        System.out.println(soma.menorNumero());
        soma.exibirNumeros();
    }
}
