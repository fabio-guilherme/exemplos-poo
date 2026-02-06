package pt.iade.poo.prova.continua._4;

public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        System.out.println(c.getSaldo());
        c.depositar(-50);
        //System.out.println(c.saldo);
        System.out.println(c.getSaldo());
    }
}