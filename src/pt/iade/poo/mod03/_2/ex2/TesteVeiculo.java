package pt.iade.poo.mod03._2.ex2;

//Classe de teste
public class TesteVeiculo {
	public static void main(String[] args) {
		// Criando instâncias de Carro e Moto
		Carro meuCarro = new Carro("Toyota", "Corolla");
		Mota minhaMoto = new Mota("Honda", "CBR 1000RR");
		
		// Chamando métodos dos veículos
		System.out.println("Testando Carro:");
		meuCarro.acelerar();
		meuCarro.frear();
		meuCarro.fazerBarulho(); // Chama fazerBarulho() padrão
		meuCarro.fazerBarulho(2); // Chama fazerBarulho() com intensidade 2
		
		System.out.println("\nTestando Moto:");
		minhaMoto.acelerar();
		minhaMoto.frear();
		minhaMoto.fazerBarulho(); // Chama fazerBarulho() padrão
		minhaMoto.fazerBarulho(3); // Chama fazerBarulho() com intensidade 3
	}
}