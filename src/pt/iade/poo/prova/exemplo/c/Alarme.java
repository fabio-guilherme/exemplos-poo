package pt.iade.poo.prova.exemplo.c;

public class Alarme {
    private Nivel nivel;

    public Alarme(Nivel nivel) {
        this.nivel = nivel;
    }

    public void ativar() {
        if (nivel == Nivel.ALTO) {
            System.out.println("Alarme sonoro ativado");
        } else {
            System.out.println("Alarme silencioso");
        }
    }
}