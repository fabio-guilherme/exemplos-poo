package pt.iade.poo.prova.exemplo.a1;

public class Carro extends Veiculo {

    private int dias;

    public Carro(String matricula, int dias) {
        super(matricula, TipoVeiculo.CARRO);
        this.dias = dias;
    }

    @Override
    public double calcularCusto() {
        return dias * 25;
    }
}