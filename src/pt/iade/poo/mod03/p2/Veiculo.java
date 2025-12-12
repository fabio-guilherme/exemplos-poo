package pt.iade.poo.mod03.p2;

public class Veiculo {
	// Atributos
	protected String marca;
	protected String modelo;
	protected String cor;
	protected int ano;
	
	// Construtor
	public Veiculo(String marca, String modelo, String cor, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	// Construtor
	public Veiculo() {
	}

	// Getters e Setters
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public int getAno() {
		return ano;
	}
}
