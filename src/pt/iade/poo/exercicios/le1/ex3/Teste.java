package pt.iade.poo.exercicios.le1.ex3;

public class Teste {
    public static void main(String[] args) {
        Contador c = new Contador();
        c.incrementar();
        c.incrementar();
        System.out.println(c.obterValor());
    }
}