package Models;

public class Cartao {

    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }


    public boolean debitar(double valor) {
        if (valor <= limite) {
            limite -= valor;
            return true;
        }
        return false;
    }
}
