package pt.iade.poo.exercicios.le1.ex5;

public class Aluno {

    private String nome;
    private int nota;

    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public boolean aprovado() {
        return nota >= 10;
    }
}