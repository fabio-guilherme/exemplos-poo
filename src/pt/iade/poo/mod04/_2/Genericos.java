package pt.iade.poo.mod04._2;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Genericos {

	public static void main(String[] args) {
		List<String> listaDeNomes = new ArrayList<>(); // Cria uma lista genérica para armazenar strings
		listaDeNomes.add("Alice"); // Adiciona o elemento "Alice" à lista
		listaDeNomes.add("Bob"); // Adiciona o elemento "Bob" à lista
		String primeiroNome = listaDeNomes.get(0); // Obtém o primeiro elemento da lista (retorna "Alice")
		System.out.println("Primeiro nome = " + primeiroNome);
		
		List<Integer> listaDeAnos = new ArrayList<>(); // Cria uma lista genérica para armazenar inteiros
		listaDeAnos.add(1998); // Adiciona o elemento 1998 à lista
		listaDeAnos.add(2026); // Adiciona o elemento 2026 à lista
		Integer segundoAno = listaDeAnos.get(1); // Obtém o primeiro elemento da lista (retorna "Alice")
		System.out.println("Primeiro ano = " + segundoAno);
		
		for (Integer ano : listaDeAnos) {
			System.out.println("ano = " + ano);
		}
		for (int i = 0; i < listaDeAnos.size(); i++) {
			//Integer terceiroAno = listaDeAnos.get(-1);}
		}
		
		Set<Integer> conjuntoDeNumeros = new HashSet<>(); // Cria um conjunto genérico para armazenar inteiros
		conjuntoDeNumeros.add(1); // Adiciona o elemento 1 ao conjunto
		conjuntoDeNumeros.add(2); // Adiciona o elemento 2 ao conjunto
		boolean contemNumero = conjuntoDeNumeros.contains(1); // Verifica se o 		elemento 1 está presente no conjunto (retorna true)
		System.out.println("Contém número = " + contemNumero);
		
		Map<String, Integer> mapaDeIdades = new HashMap<>(); // Cria um mapa genérico para armazenar pares chave-valor (string, inteiro)
		mapaDeIdades.put("Alice", 30); // Adiciona o par chave-valor ("Alice", 30) ao mapa
		mapaDeIdades.put("Bob", 25); // Adiciona o par chave-valor ("Bob", 25) ao mapa
		int idadeDoBob = mapaDeIdades.get("Bob"); // Obtém o valor associado à chave "Bob" (retorna 25)
		System.out.println("Idade do Bob = " + idadeDoBob);
		
		Map<Integer, String> mapaDeNomes = new HashMap<>(); // Cria um mapa genérico para armazenar pares chave-valor (inteiro, string)
		mapaDeNomes.put(111111111, "Rose"); // Adiciona o par chave-valor (111111111, "Rose") ao mapa
		mapaDeNomes.put(222222222, "Jack"); // Adiciona o par chave-valor (222222222, "Jack") ao mapa
		String nomeDo111111111 = mapaDeNomes.get(111111111); // Obtém o valor associado à chave 111111111 (retorna "Rose")
		System.out.println("Nome do 111111111 = " + nomeDo111111111);
	}
}
