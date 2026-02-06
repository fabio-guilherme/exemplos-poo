package pt.iade.poo.prova.continua._2;

public abstract class Trabalhador {
    protected String nome;

    public Trabalhador(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}