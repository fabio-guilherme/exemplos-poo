package pt.iade.poo.mod03._2.ex2;

//Classe Veiculo (classe abstrata)
public abstract class Veiculo {
	private String marca;
	private String modelo;

	//Construtor
	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	//Métodos de acesso aos atributos
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	//Métodos abstratos
	public abstract void fazerBarulho();

	//Métodos concretos
	public void acelerar() {
		System.out.println("Veículo está acelerando.");
	}

	public void frear() {
		System.out.println("Veículo está freando.");
	}

	//Sobrecarga do método fazerBarulho() para permitir diferentes comportamentos
	public void fazerBarulho(int intensidade) {
		for (int i = 0; i < intensidade; i++) {
			fazerBarulho(); // Chama o fazerBarulho() padrão da subclasse
		}
	}
}