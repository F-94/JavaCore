package br.com.maratonajava.javacore.oexception.runtime.test;

public class MultiplasExcepionsTest {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {

            System.out.println("dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println(" dentro do IllegalArgumentExceptio");

        }
    }
}
