package pt.iade.poo.mod02._1;

public class VerificarIdade {
	public static void main(String[] args) {
		
		int idade = 20; // Idade da pessoa
		
		// Express�o lógica para verificar se a idade é maior ou igual a 18
		boolean ehAdulto = idade >= 18;
		
		// Express�o (?) para exibir a mensagem
		System.out.println(ehAdulto ? "Esta pessoa é um adulto." : "Esta pessoa não é um adulto.");
	}
}