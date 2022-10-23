package br.com.maratonajava.javacore.oexception.runtime.test;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
            //System.out.println("escrevendo dados arquivo");

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("fechando recurso do arquivo");

        }
    }
}
