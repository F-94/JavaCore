package br.com.maratonajava.javacore.rdate.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-12-12");
        System.out.println(localDateTime);
    }
}
