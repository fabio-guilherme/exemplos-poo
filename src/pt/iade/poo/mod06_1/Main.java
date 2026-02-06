package pt.iade.poo.mod06_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EventoView view = new EventoView();
		EventoController controller = new EventoController(view);
		boolean continuar = true;
		Scanner scanner = new Scanner(System.in);
		while (continuar) {
			System.out.println("1. Adicionar Evento");
			System.out.println("2. Listar Eventos");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");
			int escolha = scanner.nextInt();
			scanner.nextLine();
			switch (escolha) {
			case 1:
				controller.adicionarEvento();
				break;
			case 2:
				controller.listarEventos();
				break;
			case 3:
				System.out.println("Encerrando o programa. Adeus!");
				continuar = false;
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		scanner.close();
	}
}