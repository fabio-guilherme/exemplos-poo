package pt.iade.poo.mod06_1;

public class Evento {
	private String descricao;
	private String data;

	public Evento(String descricao, String data) {
		this.descricao = descricao;
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Evento{" + "descricao='" + descricao + '\'' + ", data='" + data + '\'' + '}';
	}
}