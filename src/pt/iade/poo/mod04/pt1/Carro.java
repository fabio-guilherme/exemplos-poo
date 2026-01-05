package pt.iade.poo.mod04.pt1;

public class Carro implements Veiculo {
	@Override
	public void travar() {
		System.out.println("A travar o caro...");
	}
	
	@Override
	public void acelerar() {
		System.out.println("A acelerar o caro...");
	}
	
	@Override
	public void ligar() {
		System.out.println("A ligar o caro...");
	}
}
