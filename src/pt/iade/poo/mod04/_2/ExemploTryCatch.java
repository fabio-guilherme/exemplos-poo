package pt.iade.poo.mod04._2;

public class ExemploTryCatch {
	public static void main(String[] args) {
		int numerador = 10;
		int denominador = 0;
		int resultado = 0;
		
		resultado = numerador / 5;
		System.out.println("Resultado da divisão fora do try: " + resultado);
		
		try {		
			// Tentativa de divisão
			denominador = 2;
			resultado = numerador / denominador;
			System.out.println("Resultado da divisão: " + resultado);
		} catch (ArithmeticException e) {
			// Tratamento para a exceção ArithmeticException (divisão por zero)
			System.out.println("Erro ao dividir por zero: " + e.getMessage());
		} finally {
			// Código que sempre será executado após o bloco try, seja qual for o resultado
			System.out.println("Bloco finally executado.");
			// Pode ser usado para liberar recursos ou finalizar operações
			if (denominador != 0) {
				System.out.println("Liberando recursos...");
			}
		}
		
		// Outro código continua aqui após o bloco try-catch-finally
		System.out.println("Programa continuando após o bloco try-catch-finally.");
	}
}