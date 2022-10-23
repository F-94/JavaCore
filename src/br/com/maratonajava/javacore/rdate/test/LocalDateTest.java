package br.com.maratonajava.javacore.rdate.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.JUNE, 26);
        LocalDate agora = LocalDate.now();
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.getYear());
        System.out.println(agora);
    }
}
