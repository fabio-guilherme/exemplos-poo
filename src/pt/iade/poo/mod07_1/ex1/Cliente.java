package pt.iade.poo.mod07_1.ex1;

class Cliente {
	private Target target;

	public Cliente(Target target) {
		this.target = target;
	}

	public void executarOperacao() {
		target.operacao();
	}
}