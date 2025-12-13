package pt.iade.poo.mod03.pt1.ex2;

public class Carro extends Veiculo {
	private int numPortas;
	private String tipoCombustivel;

	protected Carro(String marca, String modelo, String cor, int ano, int numPortas, String tipoCombustivel) {
		super(marca, modelo, cor, ano);
		this.numPortas = numPortas;
		this.tipoCombustivel = tipoCombustivel;
	}

	// Método para obter o número de portas
	public int getNumPortas() {
		return numPortas;
	}

	// Método para configurar o número de portas
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	// Método para obter a marca (herdado de Veiculo)
	public String getMarca() {
		return super.getMarca();
	}

	// Método para obter o modelo (herdado de Veiculo)
	public String getModelo() {
		return super.getModelo();
	}

	// Método para obter a cor (herdado de Veiculo)
	public String getCor() {
		return super.getCor();
	}

	// Método para obter o ano (herdado de Veiculo)
	public int getAno() {
		return super.getAno();
	}

	// Método para obter o tipo de combustive!
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
}