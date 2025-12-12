package pt.iade.poo.mod02.p1;

public class ExemploSwitch {
	// Estado do carro (1 para ligado, 2 para desligado)
	int estado = 1;

	public void verificarEstado() {

		// Switch-case para determinar o estado do carro
		switch (estado) {
		case 1:
			System.out.println("Carro ligado");
			break;
		case 2:
			System.out.println("Carro desligado");
			break;
		// Outros casos...
		default:
			System.out.println("Estado inválido");
		}
	}

	public int diasMes(int mes) {
		int dias;

		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
		case 2:
			dias = 28;
			break;
		default:
			dias = -1;
		}
		return dias;
	}

	public static void main(String[] args) {
		ExemploSwitch exemplo = new ExemploSwitch();
		exemplo.verificarEstado();
		
		int mes = 13;
		int diasMes = exemplo.diasMes(mes);
		System.out.println("Dias do mês " + mes + " = " + diasMes);
	}
}