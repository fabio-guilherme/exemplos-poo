package pt.iade.poo.mod04._2;

public class ExemploExcecao {
	public static void main(String[] args) {
		int numerador = 10;
		int denominador = 0;
		int resultado = 0;
		
		// Tentativa de divisão por zero, resultando em uma ArithmeticException
		resultado = numerador / denominador;

		// A linha acima lançará uma ArithmeticException em tempo de execução
		// Se não for tratada, ela interromperá a execução do programa e imprimirá uma mensagem de erro no console
	}
}