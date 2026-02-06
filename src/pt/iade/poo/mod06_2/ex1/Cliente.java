package pt.iade.poo.mod06_2.ex1;

public class Cliente {
	private static Singleton singleton;
	
	public static void main(String[] args) {
		singleton = Singleton.getInstance();
	}

}
