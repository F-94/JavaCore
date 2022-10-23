package br.com.maratonajava.javacore.bintroducaometodos.teste;

import br.com.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();

        calculadora.subtraiDoisNumeros();

        calculadora.multiplicaDoisNumeros(5, 5);

        double resultaddo = calculadora.divideDoisNumeros(1000, 0);
        System.out.println(resultaddo);

        calculadora.imprimeDivisaoDeDoisNumeros(25, 0);
    }


}
