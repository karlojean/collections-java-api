package Set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {
    private Set<Convidado> convidadoSet;

    public Conjunto() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoConvidado) {
       convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigo(int condigoConvite) {
        Convidado convidadoParaRemover = null;

        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == condigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado() {
        return  convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();

        System.out.println("Existem " + conjunto.contarConvidado() + " convidado(s) dentro do Set de Convidados");

        conjunto.addConvidado("Convidado 1", 1412);
        conjunto.addConvidado("Convidado 2", 14893);
        conjunto.addConvidado("Convidado 3", 14893);

        System.out.println("Existem " + conjunto.contarConvidado() + " convidado(s) dentro  do Set de Convidados");
        conjunto.removerConvidadoPorCodigo(1412);
        conjunto.exibirConvidados();
    }
}
