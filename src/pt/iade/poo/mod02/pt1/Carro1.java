package pt.iade.poo.mod02.pt1;

public class Carro1 {

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

	// M�todo principal
	public static void main(String[] args) {
		Carro1 carro = new Carro1(); // Cria um novo objeto da classe Carro
		carro.verificarEstado(); // Chama o método para verificar o estado do carro
	}
}