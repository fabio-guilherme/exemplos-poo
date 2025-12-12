package pt.iade.poo.mod02.pt1;

public class VerificadorConducao {
	public static void verificarConducao(int idade) {
		
		// Verifica se a idade é maior ou igual a 18
		if (idade >= 18) {
			System.out.println("João pode conduzir o carro.");
		} else {
			System.out.println("João n�o pode conduzir o carro.");
		}
	}

	public static void main(String[] args) {
		int idadeJoao = 25;
		verificarConducao(idadeJoao); // Verifica se João pode conduzir o carro
	}
}