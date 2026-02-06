package pt.iade.poo.mod06_2.ex3;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ArquivoComponent {
	private String nome;
	private List<ArquivoComponent> filhos;

	public Pasta(String nome) {
		this.nome = nome;
		this.filhos = new ArrayList<>();
	}

	@Override
	public void mostrarDetalhes() {
		System.out.println("Pasta: " + nome);
		for (ArquivoComponent filho : filhos) {
			filho.mostrarDetalhes();
		}
	}

	public void adicionar(ArquivoComponent componente) {
		filhos.add(componente);
	}

	public void remover(ArquivoComponent componente) {
		filhos.remove(componente);
	}

	public List<ArquivoComponent> getFilhos() {
		return filhos;
	}
}