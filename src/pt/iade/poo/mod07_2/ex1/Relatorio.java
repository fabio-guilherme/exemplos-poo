package pt.iade.poo.mod07_2.ex1;

//Classe Relatorio: Implementa Documento e exibe informações específicas de um relatório.
public class Relatorio implements Documento {
	@Override
	public void exibirInfo() {
		System.out.println("Este é um relatório.");
	}
}