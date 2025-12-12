package pt.iade.poo.mod03.pt1.ex1;

public class Motor {
	private String tipo;

	public Motor(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void ligar() {
		System.out.println("Motor do tipo " + tipo + " ligado.");
	}

	public void desligar() {
		System.out.println("Motor do tipo " + tipo + " desligado.");
	}
}
