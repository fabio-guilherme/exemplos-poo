package pt.iade.poo.mod03.pt2.ex1;

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
}