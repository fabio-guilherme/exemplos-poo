package pt.iade.poo.mod03._1.ex2;

// classe Camiao
public class Camiao extends Veiculo {
	private float cargaMaxima;
	private String tipoCarga;

	public Camiao(String marca, String modelo, String cor, int ano, float cargaMaxima, String tipocarga) {
		super(marca, modelo, cor, ano);
		this.cargaMaxima = cargaMaxima;
		this.tipoCarga = tipocarga;
	}

	// Método para obter a carga máxima
	public float getCargaMaxima() {
		return cargaMaxima;
	}

	// Método para configurar a carga máxima
	public void setCargaMaxima( float cargaMaxima ) {
		this.cargaMaxima = cargaMaxima;
	}

	// Método para obter a marca (herdado de Veiculo)
	public String getMarca() {
		return super.getMarca();
	}

	// Método para obter o modelo (herdado de Veiculo)
	public String getModelo() {
		return super.getModelo();
	}

	// Método para obter a cor (herdado de Veiculo)
	public String getcor() {
		return super.getCor();
	}

	// Método para obter o ano (herdado de Veiculo)
	public int getAno() {
		return super.getAno();
	}

	// Método para obter o tipo de carga
	public String getTipoCarga() {
		return tipoCarga;
	}
}