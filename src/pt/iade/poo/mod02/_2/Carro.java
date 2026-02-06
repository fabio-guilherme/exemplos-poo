package pt.iade.poo.mod02._2;

public class Carro {

	// Atributos
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private boolean ligado;
	
	private static int numCarros = 0;

	public static int getNumCarros() {
		return numCarros;
	}

	// Construtor
	public Carro(String marca, String modelo, int anoFabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.ligado = false; // Por padrão, o carro inicia desligado
		
		numCarros++;
	}

	// Métodos de instância
	public void ligar() {
		this.ligado = true;
		System.out.println("Carro ligado.");
	}

	public void desligar() {
		this.ligado = false;
		System.out.println("Carro desligado.");
	}

	// Getters e setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public boolean isLigado() {
		return ligado;
	}

	// Método main
	public static void main(String[] args) {
		System.out.println("Carros antes: " + Carro.numCarros);
		
		// Criando um objeto Carro
		Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
		
		
		Carro.numCarros = 999;
		System.out.println("Carros depois: " + Carro.numCarros);

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
