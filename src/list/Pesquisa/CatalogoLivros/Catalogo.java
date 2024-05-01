package list.Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class Catalogo{
    private List<Livro> livroLista;

    public Catalogo() {
        this.livroLista = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int anoPublicacao) {
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> listaPorAutor = new ArrayList<>();

        if(!livroLista.isEmpty()) {
            for (Livro l : livroLista) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    listaPorAutor.add(l);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> listaPorIntervalo = new ArrayList<>();

        if(!livroLista.isEmpty()) {
            for(Livro l : livroLista) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    listaPorIntervalo.add(l);
                }
            }
        }

        return listaPorIntervalo;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livro  = null;

        if(!livroLista.isEmpty()) {
            for(Livro l : livroLista) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livro =  l;
                    break;
                }
            }
        }

        return livro;
    }

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        catalogo.addLivro("Livro 1", "Brean", 2001);
        catalogo.addLivro("Livro 2", "Bob", 1990);
        catalogo.addLivro("Livro 3", "Brean", 1998);

        System.out.println("Livros registrados do autor Brean: " + catalogo.pesquisaPorAutor("Brean"));
        System.out.println("Livros registrados entre 1990 e 2000: " + catalogo.pesquisaPorIntervaloAno(1990, 2000));
        System.out.println("Pesquisa Livro 1: " + catalogo.pesquisaPorTitulo("Livro 1"));
    }
}
