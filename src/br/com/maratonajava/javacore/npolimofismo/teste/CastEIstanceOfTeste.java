package br.com.maratonajava.javacore.npolimofismo.teste;

import br.com.maratonajava.javacore.npolimofismo.dominio.Computador;
import br.com.maratonajava.javacore.npolimofismo.dominio.Produto;
import br.com.maratonajava.javacore.npolimofismo.dominio.Televisao;
import br.com.maratonajava.javacore.npolimofismo.dominio.Tomate;
import br.com.maratonajava.javacore.npolimofismo.servico.CalculadoraImposto;

public class CastEIstanceOfTeste {
    public static void main(String[] args) {
        Produto produto = new Computador("NUC10i7", 11000);
        Tomate tomate= new Tomate("Americano", 5);
        Televisao tv = new Televisao("Sansumg 50\"", 5000);
tomate.setDataValidade("11/12/2021");
CalculadoraImposto.calcularImposto(tomate);
CalculadoraImposto.calcularImposto(produto);
    }
}
