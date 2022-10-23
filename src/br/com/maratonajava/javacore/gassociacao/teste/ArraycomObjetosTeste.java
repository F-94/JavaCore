package br.com.maratonajava.javacore.gassociacao.teste;

import br.com.maratonajava.javacore.gassociacao.dominio.Jogador;

public class ArraycomObjetosTeste {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Romario");
        Jogador j2 = new Jogador("Ronaldo");
        Jogador j3 = new Jogador("Rivaldo");
        Jogador[] jogadores = {j1, j2, j3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
            
        }


    }
}
