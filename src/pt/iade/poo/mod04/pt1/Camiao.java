package pt.iade.poo.mod04.pt1;

public class Camiao implements Veiculo {
	@Override
	public void travar() {
		System.out.println("A travar o camiao...");
	}
	
	@Override
	public void acelerar() {
		System.out.println("A acelerar o camiao...");
	}
	
	@Override
	public void ligar() {
		System.out.println("A ligar o camiao...");
	}
}
