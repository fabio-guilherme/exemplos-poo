package pt.iade.poo.mod02._1;

public class Carro3 {

	// Variável de objeto para armazenar o modelo do carro
	String modelo;

	// Atribui o modelo ao carro atual
	public Carro3(String modelo) {
		this.modelo = modelo;
	}

	// Acesso à variável de instância
	public void exibirModelo() {
		System.out.println("Modelo do carro: " + this.modelo);
	}

	public static void main(String[] args) {
		Carro3 carro1 = new Carro3("Fusca");
		carro1.exibirModelo(); // Saída: Modelo do carro: Fusca
	}
}