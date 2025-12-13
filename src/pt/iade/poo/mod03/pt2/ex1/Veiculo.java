package pt.iade.poo.mod03.pt2.ex1;

//Classe Veiculo (superclasse)
public class Veiculo {
	private String marca;
	private String modelo;

	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;	
	}

	public void acelerar() {
		System.out.println("Veículo está acelerando.");
	}

	public void frear() {
		System.out.println("Veículo está freando.");
	}
}