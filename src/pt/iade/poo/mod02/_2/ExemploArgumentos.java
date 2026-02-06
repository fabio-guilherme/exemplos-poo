package pt.iade.poo.mod02._2;

import java.util.Arrays;

public class ExemploArgumentos {
	// Método com argumentos primitivos (passagem por valor)
	public static void dobrarNumero(int num) {
		num *= 2;
		System.out.println("O dobro é: " + num);
	}

	// Método com argumentos de referência (passagem por referência)
	public static void alterarNome(StringBuilder nome) {
		nome.append(" Silva");
		//System.out.println("Nome alterado: " + nome);
	}

	// Método com argumento de array (passagem por referência)
	public static void dobrarElementos(int[] numeros) {
		int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
		/*
		for (int i = 0; i < copiaNumeros.length; i++) {
			copiaNumeros[i] *= 2;
		}
		System.out.println("Elementos dobrados: " + Arrays.toString(copiaNumeros));
		*/
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] *= 2;
		}
	}

	// Método com argumentos nomeados (simulação de passagem por nome)
	public static void imprimirDados(String nome, int idade) {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

	public static void main(String[] args) {
		// Passagem por valor (argumento primitivo)
		int num = 5;
		dobrarNumero(num); // num não é alterado
		System.out.println("Número original: " + num);
		
		// Passagem por referência (argumento de referência)
		StringBuilder nome = new StringBuilder("Maria");
		System.out.println("Nome original: " + nome);
		//alterarNome(new StringBuilder(nome.toString())); // nome é alterado
		alterarNome(nome); // nome é alterado
		System.out.println("Nome alterado: " + nome);

		// Passagem por referência (argumento de array)
		int[] numeros = { 1, 2, 3, 4 };
		System.out.println("Elementos originais: " + Arrays.toString(numeros));
		dobrarElementos(numeros); // elementos são dobrados
		//System.out.println("Elementos originais: " + Arrays.toString(numeros));
		System.out.println("Elementos dobrados: " + Arrays.toString(numeros));
		
		// Passagem simulada por nome (argumentos nomeados)
		imprimirDados("João", 30);
	}
}