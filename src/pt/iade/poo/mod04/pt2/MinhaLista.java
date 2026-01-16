package pt.iade.poo.mod04.pt2;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T> {
	private List<T> elementos = new ArrayList<>();

	public void adicionar(T elemento) {
		elementos.add(elemento);
	}

	public T obter(int indice) {
		return elementos.get(indice);
	}
	
	public static void main(String[] args) {
		MinhaLista<Double> mld = new MinhaLista<>();
		mld.adicionar(3.14);
		mld.adicionar(2.71);
		Double valorDouble = mld.obter(1);
		System.out.println("Valor double = " + valorDouble);
		
		MinhaLista<Boolean> mlb = new MinhaLista<>();
		mlb.adicionar(true);
		mlb.adicionar(1 == 2);
		Boolean valorBoolean = mlb.obter(1);
		System.out.println("Valor boolean = " + valorBoolean);
	}
}