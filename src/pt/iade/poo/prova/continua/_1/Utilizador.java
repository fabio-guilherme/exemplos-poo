package pt.iade.poo.prova.continua._1;

public class Utilizador {

	private String username;
	private boolean ativo;

    public Utilizador(String username) {
    	this.username = username;
        this.ativo = true;
    }

    public boolean isAtivo() {
        return ativo;
    }

}