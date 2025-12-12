package pt.iade.poo.mod01;

public class Example01 {
	
	public static class Carro {
		// Atributos
		String marca;
		String modelo;
		int anoFabrico;
		String cor;
		double velocidadeAtual;
	}

	public static void main(String[] args) {
		
		// Criando um objeto da classe Carro
		Carro meuCarro = new Carro();
		
		// Atribuindo valores aos atributos do carro
		meuCarro.marca = "Toyota";
		meuCarro.modelo = "Corolla";
		meuCarro.anoFabrico = 2020;
		meuCarro.cor = "Preto";
		meuCarro.velocidadeAtual = 0.0;
		
		// Exibindo as informações do carro
		System.out.println("Marca: " + meuCarro.marca);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano de Fabrico: " + meuCarro.anoFabrico);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Velocidade Atual: " + meuCarro.velocidadeAtual);
	}
}