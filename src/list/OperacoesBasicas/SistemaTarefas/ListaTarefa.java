package list.OperacoesBasicas.SistemaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getdescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.addTarefa("Comprar agua");
        listaTarefa.addTarefa("Tarefa 2");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removeTarefa("Comprar agua");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefas();

    }
}
