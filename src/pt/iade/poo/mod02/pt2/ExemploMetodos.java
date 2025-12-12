package pt.iade.poo.mod02.pt2;

public class ExemploMetodos {

	// Método que não recebe parâmetros e não retorna valor (void)
	public void imprimirMensagem() {
		System.out.println("Olá, mundo!");
	}

	// Método que recebe dois parâmetros inteiros e não retorna valor (void)
	public void somar(int a, int b) {
		int resultado = a + b;
		System.out.println("A soma é: " + resultado);
	}

	// Método que não recebe parâmetros e retorna um valor inteiro (int)
	public int obterIdade(int anoNascimento) {
		//return 30; // Retorna um valor fixo como exemplo
		return 2025 - anoNascimento;
	}

	// Método main para testar os outros métodos
	public static void main(String[] args) {
		ExemploMetodos exemplo = new ExemploMetodos(); // Criando um objeto da classe
		
		exemplo.imprimirMensagem(); // Chamando o método imprimirMensagem
		exemplo.somar(5, 3); // Chamando o método somar
		int idadeAtual = exemplo.obterIdade(1943); // Chamando o método obterIdade e armazenando o resultado
		System.out.println("A idade atual é: " + idadeAtual); // Imprimindo o resultado
	}
}
