package pt.iade.poo.mod04._2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ExemploCarroGenerico {
	public static void main(String[] args) {
		// Criando uma instância da classe Caixa para armazenar um Carro
		Caixa<Carro> caixaDeCarro = new Caixa<>();

		// Criando um objeto Carro e armazenando na caixa
		Carro meuCarro = new Carro("Toyota", "Corolla");
		caixaDeCarro.setConteudo(meuCarro);

		// Obtendo o carro da caixa
		Carro carroNaCaixa = caixaDeCarro.getConteudo();

		// Exibindo as informações do carro armazenado na caixa
		System.out.println("Carro na caixa: " + carroNaCaixa);
		System.out.println("Marca: " + carroNaCaixa.getMarca());
		System.out.println("Modelo: " + carroNaCaixa.getModelo());

		// Criando uma lista de carros usando ArrayList
		List<Carro> listaDeCarros = new ArrayList<>();
		listaDeCarros.add(new Carro("Honda", "Civic"));
		listaDeCarros.add(new Carro("Ford", "Mustang"));
		
		// Percorrendo e imprimindo os carros dalista
		System.out.println("Carros na lista");
		for (Carro carro : listaDeCarros) {
			System.out.println(carro);
		}
		
		// Criando um mapa de Integer para Carro usando HashMap
		Map<Integer, Carro>mapaDeIdParaCarro = new HashMap<>();
		mapaDeIdParaCarro.put(1, new Carro("Chevrolet", "Cruze"));
		mapaDeIdParaCarro.put(2, new Carro("Volkswagen", "Golf"));
		
		// Obtendo e imprimindo o carro associado ao ID 2
		System.out.println("Carro associado ao ID 2: " + mapaDeIdParaCarro.get(2));
	}
}