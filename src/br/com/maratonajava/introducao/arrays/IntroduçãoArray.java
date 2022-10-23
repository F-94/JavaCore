package br.com.maratonajava.introducao.arrays;

public class IntroduçãoArray {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Felipe";
        nomes[1] = "Goku";
        nomes[2] = "Saitama";

        for (int i = 0; i <nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}
