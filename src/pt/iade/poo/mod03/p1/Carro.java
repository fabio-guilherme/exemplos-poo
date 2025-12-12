package pt.iade.poo.mod03.p1;

public class Carro {
	private String marca;
	private String modelo;
	private Motor motor; // Associação por composição
	private boolean ligado;

	// Construtor da classe Carro que recebe um objeto Motor
	public Carro(String marca, String modelo, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.ligado = false;
	}

	public void ligar() {
		if (!ligado) {
			System.out.println("Ligando o carro...");
			motor.ligar();

			System.out.println("Carro da marca " + marca + " e modelo " + modelo + " ligado.");

			ligado = true;
		} else {

			System.out.println("O carro já está ligado.");
		}
	}

	public void desligar() {
		if (ligado) {

			System.out.println("Desligando o carro...");
			motor.desligar();

			System.out.println("Carro da marca " + marca + " e modelo " + modelo + " desligado.");

			ligado = false;

		} else {

			System.out.printf("O carro já está desligado.");
		}
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public boolean isLigado() {
		return ligado;
	}
}
