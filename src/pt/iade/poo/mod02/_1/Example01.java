package pt.iade.poo.mod02._1;

// Importa a classe ArrayList do pacote java.util
import java.util.ArrayList;

public class Example01 {

	// Variável "nome" do tipo String armazena o nome completo de uma pessoa.
	String nome = "Jo�o Silva";
	
	// Variável "idade" do tipo int armazena a idade de uma pessoa.
	int idade = 25;
	
	// Variável "estaLigado" do tipo boolean armazena o estado de um carro (ligado ou desligado).
	boolean estaLigado = true;
	static int estaMinhaNovaVariavel;
	static int[] numeros = new int[3];	
	
	// Declaração de uma ArrayList que armazenará números inteiros
	static ArrayList<Integer> listaNumeros = new ArrayList<>();
	
	
	public static void main(String[] args) {
		estaMinhaNovaVariavel = 99;
		
		System.out.println(estaMinhaNovaVariavel);
		
		//Module2Example01 m2e = new Module2Example01();
		
		// Adiciona números à lista
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		
		numeros[0] = 6;
		numeros[1] = 7;
		numeros[2] = 8;
		
		for(Integer n: listaNumeros) {
			System.out.println(n);
		}
		
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
