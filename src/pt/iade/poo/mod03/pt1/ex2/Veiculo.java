package pt.iade.poo.mod03.pt1.ex2;

public class Veiculo {
	// Atributos
	protected String marca;
	private String modelo;
	private String cor;
	private int ano;
	
	// Construtor
	public Veiculo(String marca, String modelo, String cor, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	// Construtor (sobrecarga/overload)
	public Veiculo() {
	}

	// Getters e Setters para os atributos
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
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
