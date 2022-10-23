package br.com.maratonajava.javacore.gassociacao.teste;

import br.com.maratonajava.javacore.gassociacao.dominio.Jogador;
import br.com.maratonajava.javacore.gassociacao.dominio.Time;

public class BidiressionalTeste {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Muller");
        Time time = new Time("São Paulo");
        Jogador[]jogadores = {jogador, jogador2};
        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);


        System.out.println("-----Jogador-----");
        jogador2.imprime();
        jogador.imprime();

        System.out.println("----Time-----");

        time.imprime();

    }
}
