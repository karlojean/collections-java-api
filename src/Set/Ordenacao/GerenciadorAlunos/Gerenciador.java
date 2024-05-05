package Set.Ordenacao.GerenciadorAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Gerenciador {
    private Set<Aluno> gerenciadorSet;

    public Gerenciador() {
        this.gerenciadorSet = new HashSet<>();
    }

    public void addAluno(String nome, int matricula, double nota) {
        gerenciadorSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(int matricula) {
        for(Aluno a : gerenciadorSet) {
            if(a.getMatricula() == matricula) {
                gerenciadorSet.remove(a);
                break;
            }
        }
    }

    public Set<Aluno> exibirPorNome() {
        Set<Aluno> listaPorNome = new TreeSet<>(gerenciadorSet);

        return listaPorNome;
    }

    public Set<Aluno> exibirPorNota() {
        Set<Aluno> listaPorNota = new TreeSet<>(new ComparatorPorNota());
        listaPorNota.addAll(gerenciadorSet);

        return listaPorNota;
    }

    public Set<Aluno> exibirTodos() {
        return gerenciadorSet;
    }

    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();

        gerenciador.addAluno("Petter", 123, 5);
        gerenciador.addAluno("John Doe", 222, 8);
        gerenciador.addAluno("Bell", 986, 7);

        System.out.println(gerenciador.exibirPorNome());

        gerenciador.removerAluno(222);

        System.out.println(gerenciador.exibirPorNota());

        System.out.println(gerenciador.exibirTodos());
    }


}
