package br.com.maratonajava.javacore.npolimofismo.servico;

import br.com.maratonajava.javacore.npolimofismo.dominio.Computador;
import br.com.maratonajava.javacore.npolimofismo.dominio.Produto;
import br.com.maratonajava.javacore.npolimofismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto tomate");
        double imposto = produto.calcularImposto();
        System.out.println("produto: " + produto.getNome());
        System.out.println("valor: " + produto.getValor());
        System.out.println("imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());

        }
    }
}