package pt.iade.poo.mod02.pt1;

public class Carro {

	// Variável estática para contar o número total de carros
	static int contadorDeCarros = 0;

	// Variável de objeto para armazenar o modelo do carro
	String modelo;

	// Método para verificar o estado do carro
	public void verificarEstado() {
		// Variável de bloco local indicando se o carro está ligado
		boolean ligado = true;
		// Verifica se o carro está ligado e exibe uma mensagem
		if (ligado) {
			System.out.println("O carro está ligado");
		}
		// A variável 'ligado' não é acessível fora deste bloco
	}

	// Incrementa o contador ao criar um novo carro
	public Carro() {
		contadorDeCarros++;
	}
	
	// Atribui o modelo ao carro atual
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	// Acesso à variável de instância
	public void exibirModelo() {
		System.out.println("Modelo do carro: " + this.modelo);
	}

	// Método principal
	public static void main(String[] args) {
		Carro carro = new Carro(); // Cria um novo objeto da classe Carro
		carro.verificarEstado(); // Chama o método para verificar o estado do carro
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		// Acesso direto à variável estática
		System.out.println("Total de carros: " + Carro2.contadorDeCarros);
		
		Carro carro3 = new Carro("Fusca");
		carro3.exibirModelo(); // Saída: Modelo do carro: Fusca
	}
}