package br.com.maratonajava.javacore.fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização estático");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }
    public Anime(String nome){
        this.nome = nome;
    }
    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.println("Episodio " + episodio);
        }
        System.out.println();
    }
    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
