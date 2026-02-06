package pt.iade.poo.mod03._1.ex2;

// Classe principal para testar as classes
public class Main {

	public static void main(String[] args) {
		// Criando um objeto Carro
		Carro carro = new Carro("Fiat", "Palio", "Branco", 2020, 4, "Gasolina");

		// Imprimindo informações do carro
		System.out.println("Carro:");
		System.out.println("Marca: " + carro.getMarca());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Ano: " + carro.getAno());
		System.out.println("Número de Portas: " + carro.getNumPortas());
		System.out.println("Tipo de Combustivel: " + carro.getTipoCombustivel());
		
		// Criando um objeto Camiao
		Camiao camiao = new Camiao("Volvo", "FH", "Azul", 2018, 20000, "Grãos");
		
		// Imprimindo informações do camião
		System.out.println("\nCamião:");
		System.out.println("Marca: " + camiao.getMarca());
		System.out.println("Modelo: " + camiao.getModelo());
		System.out.println("Cor: " + camiao.getCor());
		System.out.println("Ano: " + camiao.getAno());
		System.out.println("Carga Máxima: " + camiao.getCargaMaxima() + " kg");
		System.out.println("Tipo de Carga: " + camiao.getTipoCarga());
	}
}