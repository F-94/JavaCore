package br.com.maratonajava.javacore.oexception.exception.test;

import java.io.*;

public class TryWithResoucesTest {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
       try( Reader reader = new BufferedReader(new FileReader("test.txt"))) {

       }catch (IOException e){
           e.printStackTrace();
       }

    }
}
