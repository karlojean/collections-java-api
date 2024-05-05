package Map.Ordenacao.LivrariaOnline;

import java.util.*;

public class Livraria {
    Map<String, Livro> livrariaMap;

    public Livraria() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrariaMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover) {
            livrariaMap.remove(chave);
        }
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livrariaMap.isEmpty()) {
            for (Livro livro : livrariaMap.values()) {
                if (livro.getpreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getpreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
            if(entry.getValue().getpreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livrariaMap.isEmpty()) {
            for (Livro livro : livrariaMap.values()) {
                if (livro.getpreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getpreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
            if(entry.getValue().getpreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livrariaMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }


    public static void main(String[] args) {
        Livraria livraria = new Livraria();
        // Adiciona os livros à livraria online
        livraria.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livraria.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livraria.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livraria.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livraria.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livraria.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        System.out.println(livraria.obterLivroMaisBarato());
        System.out.println(livraria.obterLivroMaisCaro());

        System.out.println(livraria.pesquisarLivrosPorAutor("George Orwell"));


    }
}
