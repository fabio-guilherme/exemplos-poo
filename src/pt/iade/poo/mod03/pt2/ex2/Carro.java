package pt.iade.poo.mod03.pt2.ex2;

//Subclasse Carro
public class Carro extends Veiculo {
	// Construtor
	public Carro(String marca, String modelo) {
		super(marca, modelo);
	}

	// Implementação do método fazerBarulho() para Carro
	@Override
	public void fazerBarulho() {
		System.out.println("Carro fazendo barulho de motor.");
	}

	// Sobrescrita do método acelerar() da classe Veiculo
	@Override
	public void acelerar() {
		System.out.println("Carro " + getMarca() + " " + getModelo() + " está acelerando.");
	}

	// Sobrescrita do método frear() da classe Veiculo
	@Override
	public void frear() {
		System.out.println("Carro " + getMarca() + " " + getModelo() + " está freando.");
	}
}