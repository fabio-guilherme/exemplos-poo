package pt.iade.poo.mod07_1.ex1;

//Object Adapter que adapta Adaptee para Target
class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void operacao() {
		//Chama o método específico de Adaptee através do Adapter
		adaptee.operacaoEspecifica();
	}
}