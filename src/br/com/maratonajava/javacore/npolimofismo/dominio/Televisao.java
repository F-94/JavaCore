package br.com.maratonajava.javacore.npolimofismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.30;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do televisão");
        return this.valor * IMPOSTO_POR_CENTO;    }
}
