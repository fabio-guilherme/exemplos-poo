package pt.iade.poo.mod06_2.ex3;

public class Arquivo implements ArquivoComponent {
	private String nome;
	private double tamanho;

	public Arquivo(String nome, double tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}

	@Override
	public void mostrarDetalhes() {
		System.out.println("Arquivo: " + nome + " (Tamanho: " + tamanho + " MB)");
	}
}