package pt.iade.poo.prova.exemplo.b;

public class Teste {
    public static void main(String[] args) {
    	// Incorreto: não é possível instanciar uma classe abstrata.
    	// Animal a = new Animal();
    	Animal a = new Cao();		// Correto (usando poliformismo)
    	a.emitirSom();
    }
}