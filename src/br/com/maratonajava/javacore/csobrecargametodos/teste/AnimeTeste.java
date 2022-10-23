package br.com.maratonajava.javacore.csobrecargametodos.teste;

import br.com.maratonajava.javacore.csobrecargametodos.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Ação");

        anime.imprime();
    }
}
