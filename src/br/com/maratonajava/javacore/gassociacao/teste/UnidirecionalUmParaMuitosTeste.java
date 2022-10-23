package br.com.maratonajava.javacore.gassociacao.teste;

import br.com.maratonajava.javacore.gassociacao.dominio.Jogador;
import br.com.maratonajava.javacore.gassociacao.dominio.Time;

public class UnidirecionalUmParaMuitosTeste {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pele");
        Time time = new Time("Santos");
        jogador.setTime(time);
        jogador.imprime();



    }
}
