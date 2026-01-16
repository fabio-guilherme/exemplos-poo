package pt.iade.poo.exercicios.le1.ex1;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String descricao() {
        return titulo + " - " + autor;
    }
}