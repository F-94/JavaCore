package br.com.maratonajava.javacore.oexception.runtime.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            divisao(2, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    private static int  divisao(int a, int b) throws IllegalArgumentException{
        if(b ==0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
     return a/b;
    }
}
