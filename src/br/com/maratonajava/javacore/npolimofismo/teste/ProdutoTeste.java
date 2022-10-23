package br.com.maratonajava.javacore.npolimofismo.teste;

import br.com.maratonajava.javacore.npolimofismo.dominio.Computador;
import br.com.maratonajava.javacore.npolimofismo.dominio.Televisao;
import br.com.maratonajava.javacore.npolimofismo.dominio.Tomate;
import br.com.maratonajava.javacore.npolimofismo.servico.CalculadoraImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate= new Tomate("siciliano", 5);
        Televisao tv = new Televisao("Sansumg 50\"", 5000);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(tv);
    }
}
