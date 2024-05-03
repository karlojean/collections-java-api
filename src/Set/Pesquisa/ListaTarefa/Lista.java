package Set.Pesquisa.ListaTarefa;


import java.util.HashSet;
import java.util.Set;

public class Lista {
    private Set<Tarefa> tarefaSet;

    public Lista() {
        this.tarefaSet = new HashSet<>();
    }

    public void addTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaSet.remove(t);
                    break;
                }
            }
        }

        System.out.println("Lista de tarefa está vazia");
    }

    public void exibirTarefa() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {

        Set<Tarefa> tarefasConluidas = new HashSet<>();

        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if(t.isConcluida()) {
                    tarefasConluidas.add(t);
                }
            }
        }

        return tarefasConluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {

        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if(!t.isConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
        }

        return tarefasPendentes;
    }

    public Tarefa pesquisaTarefa(String descricao) {
        Tarefa tarefa = null;

        if(!tarefaSet.isEmpty()) {
            for(Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa = t;
                    break;
                }
            }
        }

        return tarefa;
    }

    public void marcarTarefaConluida(String descricao) {
        Tarefa tarefa = pesquisaTarefa(descricao);

        if(tarefa == null) {
            System.out.println("Tarefa não encontrada");
        }

        tarefa.setConcluida(true);

        System.out.println("Tarefa Atualizada");
    }


    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefa = pesquisaTarefa(descricao);

        if(tarefa == null) {
            System.out.println("Tarefa não encontrada");
        }

        tarefa.setConcluida(false);

        System.out.println("Tarefa Atualizada");
    }

    public void limparListaTarefa() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.addTarefa("Comprar");
        lista.addTarefa("Ir na loja");
        lista.addTarefa("Finalizar servico");

        lista.exibirTarefa();
        System.out.println("Temos " + lista.contarTarefas()  + " tarefas");

        lista.marcarTarefaConluida("Comprar");
        lista.marcarTarefaConluida("Ir na loja");

        System.out.println(lista.obterTarefasConcluidas());
        System.out.println(lista.obterTarefasPendentes());

        lista.marcarTarefaPendente("Comprar");

        System.out.println(lista.obterTarefasConcluidas());
        System.out.println(lista.obterTarefasPendentes());

        lista.limparListaTarefa();

        lista.exibirTarefa();
    }


}
