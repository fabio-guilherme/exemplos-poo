package pt.iade.poo.mod02._1;

public class Exemplo02 {

	static public void exibirMensagens1() {
		// ciclo for para exibir mensagens de 0 a 4
		for (int i = 0; i < 5; i++) {
			System.out.println("Mensagem1 " + i);
		}
	}

	static public void exibirMensagens2() {
		int i = 0; // Inicialização do contador
		// Ciclo while para exibir mensagens de 0 a 4
		while (i < 5) {
			System.out.println("Mensagem2 " + i);
			i++; // Incremento do contador
		}
	}

	static public void exibirMensagens3() {
		int i = 0; // Inicialização do contador
		// Ciclo while para exibir mensagens de 0 a 4
		do {
			System.out.println("Mensagem3 " + i);
			i++; // Incremento do contador
		} while (i < 5);
	}

	static public void exibirMensagens4() {
		int[] numeros = new int[] {0, 1, 2, 3, 4};
		for (int i : numeros) {
			System.out.println("Mensagem4 " + i);
		}
	}
	
	public static void main(String[] args) {
		exibirMensagens1();
		System.out.println("\n");
		exibirMensagens2();
		System.out.println("\n");
		exibirMensagens3();
		System.out.println("\n");
		exibirMensagens4();		
	}

}
