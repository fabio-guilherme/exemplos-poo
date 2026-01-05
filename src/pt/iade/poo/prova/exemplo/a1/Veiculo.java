package pt.iade.poo.prova.exemplo.a1;

public abstract class Veiculo {
    protected String matricula;
    protected TipoVeiculo tipo;

    public Veiculo(String matricula, TipoVeiculo tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public abstract double calcularCusto();
}