package pt.iade.poo.mod03.pt2.ex1;

public class TesteVeiculo {
	public static void testarVeiculo(Veiculo veiculo) {
		veiculo.acelerar();
		veiculo.frear();
	}

	public static void main(String[] args) {
		// Criando instâncias de Carro e Mota
		Carro meuCarro = new Carro("Toyota", "Corolla");
		Mota minhaMota = new Mota("Honda", "CBR 1000RR");
		Veiculo meuVeiculo = new Veiculo("Nasa", "foguete");
		
		// Chamando a função testarVeiculo com diferentes tipos de veículos
		System.out.println("Testando Carro:");
		testarVeiculo(meuCarro);
		System.out.println("\nTestando Mota:");
		testarVeiculo(minhaMota);
		
		 // Métodos específicos da mota
		System.out.println("\nMétodos específicos da Mota:");
		minhaMota.empinar();
		minhaMota.frear();
		minhaMota.frear("Screee!");
		
		// Testando objeto do tipo Veiculo
		System.out.println("\nTestando Veículo:");
		meuVeiculo.acelerar();
		meuVeiculo.frear();

	}
}