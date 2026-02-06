package pt.iade.poo.mod07_1.ex1;

//Exemplo de uso do padrão Adapter
public class Main {
	public static void main(String[] args) {
		//Cria um Adaptee
		Adaptee adaptee = new Adaptee();
		
		//Cria um Adapter para adaptar Adaptee a Target
		Target adapter = new Adapter(adaptee);
		
		//Cliente utiliza o Adapter (que implementa a interface Target)
		Cliente cliente = new Cliente(adapter);
		cliente.executarOperacao();
	}
}