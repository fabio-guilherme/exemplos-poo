package pt.iade.poo.mod02._1;

public class ControloCarro {
	public static void main(String[] args) {
		// Simulação do controlo de um carro
		carro: // Label para o ciclo externo
		for (int i = 0; i < 3; i++) {
			System.out.println("Volta número: " + i);
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1) {
					//break carro; // Sai completamente da corrida se houver uma falha grave
					continue carro;
					//break;
				}
				System.out.println(" Ação: " + j);
			}
		}
		System.out.println("Fim da corrida");
	}
}