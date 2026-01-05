package pt.iade.poo.mod04.pt1;

public class CarroElectrico implements VeiculoElectrico {
	@Override
	public void travar() {
		System.out.println("A travar o carro...");
	}

	@Override
	public void acelerar() {
		System.out.println("A acelerar o carro...");
	}
	
	@Override
	public void ligar() {
		System.out.println("A ligar o carro...");
	}
	
	@Override
	public void carregar() {
		System.out.println("A carregar o carro...");
	}
}
