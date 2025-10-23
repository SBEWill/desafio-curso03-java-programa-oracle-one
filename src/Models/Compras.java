package Models;

import java.util.ArrayList;
import java.util.List;

public class Compras{

    private String produto;
    private double valor;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



    @Override
    public String toString() {
        return "Item: " +  produto +
                " valor= R$" + valor;
    }


}
