package pt.iade.poo.mod02.p1;

import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ControleCorrida {
	public static void main(String[] args) {
		
		// Array de carros na corrida
		String[] carrosArray = {"Ford Fiesta", "Volkswagen Golf", "Toyota Corolla"};
		
		// Lista dinâmica para armazenar os eventos da corrida
		List<String> eventos = new ArrayList<>();
		Random random = new Random();
		
		for (int volta = 1; volta <= 3; volta++) { // Loop para simular 3 voltas da corrida
			eventos.add("Volta " + volta + ":"); // Adiciona uma nova volta à lista de eventos
			for (String carro : carrosArray) { // Loop sobre os carros no array
				int velocidadeAtual = random.nextInt(200) + 100; // Velocidade aleatória entre 100 e 300 km/h
				eventos.add(" " + carro + ": " + velocidadeAtual + " km/h"); // Adiciona evento de velocidade do carro à lista
			}
		}
		
		// Imprimindo os eventos da corrida
		for (String evento : eventos) { // Loop para exibir cada evento
			System.out.println(evento);
		}
	}
}