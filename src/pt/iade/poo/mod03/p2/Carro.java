package pt.iade.poo.mod03.p2;

public class Carro extends Veiculo {
	private int numPortas;
	private String tipoCombustivel;
	
	protected Carro(String marca, String modelo, String cor, int ano, int numPortas, String tipoCombustivel) {
		super(marca, modelo, cor, ano);
		this.numPortas = numPortas;
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
}
