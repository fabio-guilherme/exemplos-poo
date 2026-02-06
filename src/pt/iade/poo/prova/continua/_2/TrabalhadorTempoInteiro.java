package pt.iade.poo.prova.continua._2;

public class TrabalhadorTempoInteiro extends Trabalhador {

    private double salarioMensal;

    public TrabalhadorTempoInteiro(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}