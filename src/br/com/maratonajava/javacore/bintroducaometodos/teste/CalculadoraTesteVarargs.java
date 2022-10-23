package br.com.maratonajava.javacore.bintroducaometodos.teste;

import br.com.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTesteVarargs {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {2,5,6,8,7};
        calculadora.somaArray(numeros);
        calculadora.somaVarargs(numeros);
        calculadora.somaVarargs(20,30,40,50);

    }
}
