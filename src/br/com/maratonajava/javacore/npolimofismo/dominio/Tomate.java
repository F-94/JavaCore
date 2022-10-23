package br.com.maratonajava.javacore.npolimofismo.dominio;

public class Tomate extends Produto {
    private String dataValidade;
    public static final double IMPOSTO_POR_CENTO = 0.10;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
