package Set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contato> setContato;

    public Agenda() {
        this.setContato = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        setContato.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(setContato);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();

        for(Contato c : setContato) {
            if(c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }

        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for(Contato c : setContato) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.exibirContato();

        agenda.addContato("Jean", 123131);
        agenda.addContato("Petter", 896211);
        agenda.addContato("Petter", 12);
        agenda.addContato("Petter Park", 12837);
        agenda.addContato("Jean", 1222);

        agenda.exibirContato();

        System.out.println(agenda.pesquisaPorNome("Petter"));

        System.out.println(agenda.atualizarNumeroContato("Petter Park", 12344556));
        agenda.exibirContato();
    }

}
