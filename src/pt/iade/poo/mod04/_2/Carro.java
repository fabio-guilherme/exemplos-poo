package pt.iade.poo.mod04._2;

//Definição da classe Carro
public class Carro {
	private String marca;
	private String modelo;

	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	@Override
	public String toString() {
		return "Carro da marca " + marca + " e modelo " + modelo;
	}
}