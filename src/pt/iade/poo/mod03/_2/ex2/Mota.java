package pt.iade.poo.mod03._2.ex2;

//Subclasse Mota
public class Mota extends Veiculo {
	//Construtor
	public Mota(String marca, String modelo) {
		super(marca, modelo);
	}

	//Implementação do método fazerBarulho() para Moto
	@Override
	public void fazerBarulho() {
		System.out.println("Mota fazendo barulho de motor.");
	}

	//Sobrescrita do método acelerar() da classe Veiculo
	@Override
	public void acelerar() {
		System.out.println("Mota " + getMarca() + " " + getModelo() + " está acelerando.");
	}

	//Sobrescrita do método frear() da classe Veiculo
	@Override
	public void frear() {
		System.out.println("Mota " + getMarca() + " " + getModelo() + " está freando.");
	}
}