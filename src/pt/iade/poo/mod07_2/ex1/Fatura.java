package pt.iade.poo.mod07_2.ex1;

//ClasseFatura: Implementa Documento e exibe informações específicas de uma Fatura.
public class Fatura implements Documento {
	@Override
	public void exibirInfo() {
		System.out.println("Esta é uma fatura.");
	}
}