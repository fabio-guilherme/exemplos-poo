package pt.iade.poo.mod04._2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ExemploCarros {
	public static void main(String[] args) {
		List<Carro> carros = new ArrayList<>();
		carros.add(new Carro("Toyota", "Corolla"));
		carros.add(new Carro("Honda", "Civic"));
		carros.add(new Carro("Ford", "Mustang"));
		
		// Utilizando uma classe anónima para imprimir os detalhes de cada carro
		System.out.println("Detalhes dos carros usando classe anónima:");
		Consumer<Carro> imprimirDetalhesComClasseAnonima = new Consumer<Carro>() {
			public void accept(Carro carro) {
				System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo());
			}
		};
		carros.forEach(imprimirDetalhesComClasseAnonima);
		System.out.println(); // Quebra de linha
		
		// Utilizando uma expressão lambda para obter uma lista de modelos de carros
		System.out.println("Lista de modelos de carros usando expressão lambda:");
		Function<Carro, String> extrairModeloComLambda = carro -> carro.getModelo();
		List<String> modelos = new ArrayList<>();
		carros.forEach(carro -> modelos.add(extrairModeloComLambda.apply(carro)));
		System.out.println("Modelos: " + modelos);
		System.out.println(); // Quebra de linha
		
		// Utilizando uma closure para contar o número de carros de uma determinada marca
		System.out.println("Contagem de carros por marca usando closure:");
		String marcaAlvo = "Toyota";
		final int[] contagem = { 0 }; // Utilizando um array para contagem mutável
		Consumer<Carro> contarCarrosComClosure = carro -> {
			if (carro.getMarca().equals(marcaAlvo)) {
				contagem[0]++;
			}
		};
		carros.forEach(contarCarrosComClosure);
		System.out.println("Número de carros da marca " + marcaAlvo + ": " + contagem[0]);
	}
}