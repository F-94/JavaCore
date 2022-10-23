package br.com.maratonajava.javacore.eblocosdeinicializacao.teste;

import br.com.maratonajava.javacore.eblocosdeinicializacao.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }

}
