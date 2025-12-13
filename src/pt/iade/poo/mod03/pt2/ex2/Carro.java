package pt.iade.poo.mod03.pt2.ex2;

//Subclasse Carro
public class Carro extends Veiculo {
	public Carro(String marca, String modelo) {
		super(marca, modelo);
	}

	@Override
	public void acelerar() {
		System.out.println("Carro " + getMarca() + " " + getModelo() + " está acelerando.");
	}

	@Override
	public void frear() {
		System.out.println("Carro " + getMarca() + " " + getModelo() + " está freando.");
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Vrum Vrum! Carro fazendo barulho de motor.");
	}
}