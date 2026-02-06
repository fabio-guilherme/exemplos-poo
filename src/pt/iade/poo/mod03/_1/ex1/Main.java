package pt.iade.poo.mod03._1.ex1;

public class Main {

	public static void main(String[] args) {
		// Criando um objeto Motor
		Motor motorCarro1 = new Motor("Motor a combustão");
		Motor motorCarro2 = new Motor("Motor elétrico");

		// Criando um objeto Carro e associando-o com o motor criado
		Carro meuCarro1 = new Carro("Toyota", "Corolla", motorCarro1);
		Carro meuCarro2 = new Carro("Tesla", "Y", motorCarro1);

		// Ligando o carro
		meuCarro1.ligar();
		// Tentando ligar o carro novamente
		meuCarro1.ligar();

		// Desligando o carro
		meuCarro1.desligar();
		// Tentando desligar o carro novamente
		meuCarro1.desligar();
		
		// Ligando o carro
		meuCarro2.ligar();
		// Tentando ligar o carro novamente
		meuCarro2.ligar();

		// Desligando o carro
		meuCarro2.desligar();
		// Tentando desligar o carro novamente
		meuCarro2.desligar();

	}
}
