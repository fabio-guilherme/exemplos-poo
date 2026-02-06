package pt.iade.poo.mod06_2.ex2;

public class Singleton {
	// Instância privada estática da classe
	private static volatile Singleton instance;

	// Construtor privado para impedir a criação de novas instâncias
	private Singleton() {
		// Código de inicialização, se necessário
	}

	// Método público estático para fornecer o ponto de acesso global à instância
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}