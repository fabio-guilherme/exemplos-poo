package pt.iade.poo.mod06_1;

import java.util.Scanner;

class EventoView {
	private Scanner scanner;

	public EventoView() {
		this.scanner = new Scanner(System.in);
	}

	public String getDescricao() {
		System.out.print("Digite a descrição do evento: ");
		return scanner.nextLine();
	}

	public String getData() {
		System.out.print("Digite a data do evento (dd/mm/yyyy): ");
		return scanner.nextLine();
	}

	public void displayEvento(Evento evento) {
		System.out.println("\u001B[34m"); // Código ANSI para cor azul
		System.out.println("Evento: " + evento.getDescricao() + " | Data: " + evento.getData());
		System.out.println("\u001B[0m"); // Restaurar a cor padrão
		System.out.println(); // Adicionar uma linha em branco
	}

	public void displayAllEventos(Evento[] eventos) {
		System.out.println("\u001B[34m"); // Código ANSI para cor azul
		System.out.println("Lista de Eventos:");
		for (Evento evento : eventos) {
			System.out.println(evento);
		}
		System.out.println("\u001B[0m"); // Restaurar a cor padrão
		System.out.println(); // Adicionar uma linha em branco
	}
}