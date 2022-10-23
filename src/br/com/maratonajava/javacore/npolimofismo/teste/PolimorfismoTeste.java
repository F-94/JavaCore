package br.com.maratonajava.javacore.npolimofismo.teste;

import br.com.maratonajava.javacore.npolimofismo.dominio.Computador;
import br.com.maratonajava.javacore.npolimofismo.dominio.Produto;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Produto produto = new Computador("i5", 4000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

    }
}
