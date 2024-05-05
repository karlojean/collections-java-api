package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Integer> agendaMap;

    public Agenda() {
        this.agendaMap = new HashMap<>();
    }

    public void addContato(String nome, int numero){
        agendaMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!agendaMap.isEmpty()) {
            agendaMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaMap);
    }

    public int pesquisaPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaMap.isEmpty()) {
            numeroPorNome = agendaMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addContato("Jean", 1023211);
        agenda.addContato("Petter", 12931231);
        agenda.addContato("Juni", 1231231);

        agenda.exibirContatos();

        agenda.removerContato("Juni");

        agenda.exibirContatos();

        System.out.println(agenda.pesquisaPorNome("Jean"));
    }
}
