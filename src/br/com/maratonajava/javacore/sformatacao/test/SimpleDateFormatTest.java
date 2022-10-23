package br.com.maratonajava.javacore.sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(new Date()));

    }
}
