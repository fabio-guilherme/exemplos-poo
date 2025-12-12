package pt.iade.poo.mod02.p2;

public class ContaBancaria {
	private double saldo;
	
	// Construtor
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	//Método para sacar dinheiro
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de " + valor + " realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para realizar o saque.");
		}
	}

	//Método para depositar dinheiro
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de " + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor de depósito inválido.");
		}
	}

	//Método para obter o saldo
	public double getSaldo() {
		return saldo;
	}
	
	//Exemplo de interação entre métodos e argumentos
	public void transferir(ContaBancaria destino, double valor) {
		if (valor > 0 && valor <= saldo) {
			this.sacar(valor);
			destino.depositar(valor);
			System.out.println("Transferência de " + valor + " realizada com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para realizar a transferência.");
		}
	}


	public static void main(String[] args) {
		// Exemplo de uso da classe ContaBancaria
		ContaBancaria conta1 = new ContaBancaria(1000);
		ContaBancaria conta2 = new ContaBancaria(500);
		System.out.println("Saldo da conta 1: " + conta1.getSaldo());
		System.out.println("Saldo da conta 2: " + conta2.getSaldo());
		conta1.transferir(conta2, 300);
		System.out.println("Saldo da conta 1 após transferência: " + conta1.getSaldo());
		System.out.println("Saldo da conta 2 após transferência: " + conta2.getSaldo());
	}
}