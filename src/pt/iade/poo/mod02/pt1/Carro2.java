package pt.iade.poo.mod02.pt1;

public class Carro2 {

	// Variável estática para contar o número total de carros
	static int contadorDeCarros = 0;

	// Incrementa o contador ao criar um novo carro
	public Carro2() {
		contadorDeCarros++;
	}

	public static void main(String[] args) {
		Carro2 carro1 = new Carro2();
		Carro2 carro2 = new Carro2();
		
		// Acesso direto à variável estática
		System.out.println("Total de carros: " + Carro2.contadorDeCarros);
	}
}