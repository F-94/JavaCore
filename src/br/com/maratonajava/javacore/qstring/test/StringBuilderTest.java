package br.com.maratonajava.javacore.qstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {

        String nome = "Felipe";
        nome.concat("Chagas");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Felipe Chagas");
        sb.append(" é").append(" demais");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,2 );
        System.out.println(sb);
    }
}
