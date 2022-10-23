package br.com.maratonajava.javacore.dconstrutores.teste;
import br.com.maratonajava.javacore.dconstrutores.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Haykiuu", "TV", 12, "Ação", "Production 10");

        anime.imprime();
    }
}
