package pt.iade.poo.mod02._2;

public class TestaCarro {
	public static void main(String[] args) {
		System.out.println("Carros antes: " + Carro.getNumCarros());
		
		// Criando um objeto Carro
		Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
		
		System.out.println("Carros depois: " + Carro.getNumCarros());

		// Acessando e modificando os atributos
		System.out.println("Marca do carro: " + meuCarro.getMarca());
		System.out.println("Modelo do carro: " + meuCarro.getModelo());
		System.out.println("Ano de fabricação do carro: " + meuCarro.getAnoFabricacao());
		
		// Ligando o carro
		meuCarro.ligar();
		
		// Verificando se o carro está ligado
		if (meuCarro.isLigado()) {
			System.out.println("O carro está ligado.");
		} else {
			System.out.println("O carro está desligado.");
		}
		
		// Desligando o carro
		meuCarro.desligar();
	}

}
