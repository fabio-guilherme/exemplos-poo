package pt.iade.poo.mod03._2.ex1;

//Subclasse Mota
public class Mota extends Veiculo {
	public Mota(String marca, String modelo) {
		super(marca, modelo);
	}

	@Override
	public void acelerar() {
		System.out.println("Mota " + getMarca() + " " + getModelo() + " está acelerando.");
	}
	
	@Override
	public void frear() {
		System.out.println("Mota " + getMarca() + " " + getModelo() + " está freando.");
	}
	
	//Overload
	public void frear(String som) {
		System.out.println("Mota " + getMarca() + " " + getModelo() + " está freando com o som." + som);
	}

	public void empinar() {
		System.out.println("Fazendo cavalinho com a minha mota.");
	}
}