package pt.iade.poo.mod01;

public class Example02 {
	
	public static class Caneta {
		// Atributos
		static int numeroCanetas = 0;
		String marca;
		String tipo;
		String cor;
		String materialDoCorpo;
		double ponta;

		// Construtor com parâmetros
		public Caneta(String marca, String tipo, String cor, String materialDoCorpo, double ponta) {
			this.marca = marca;
			this.tipo = tipo;
			this.cor = cor;
			this.materialDoCorpo = materialDoCorpo;
			this.ponta = ponta;		
			numeroCanetas++;
		}
		
		// Método para exibir as informações da caneta
		public void mostrarInformacoes() {
			System.out.println("Marca: " + marca);
			System.out.println("Tipo: " + tipo);
			System.out.println("Cor: " + cor);
			System.out.println("Material do Corpo: " + materialDoCorpo);
			System.out.println("Ponta: " + ponta);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Caneta.numeroCanetas);
		
		// Criando instâncias de Caneta com construtor com parâmetros
		Caneta caneta01 = new Caneta("Bic", "Esferográfica", "Azul", "Plástico", 0.7);
		System.out.println(Caneta.numeroCanetas);
		Caneta caneta02 = new Caneta("Pilot", "Gel", "Preto", "Plástico", 0.5);
		System.out.println(Caneta.numeroCanetas);
		Caneta caneta03 = new Caneta("Stabilo", "Marcador", "Vermelho", "Plástico", 1.0);
		System.out.println(Caneta.numeroCanetas);
		
		// Mostrar informações das canetas
		System.out.println("Informações da Caneta 01:");
		caneta01.mostrarInformacoes();
		System.out.println("\nInformações da Caneta 02:");
		caneta02.mostrarInformacoes();
		System.out.println("\nInformações da Caneta 03:");
		caneta03.mostrarInformacoes();
	}
}