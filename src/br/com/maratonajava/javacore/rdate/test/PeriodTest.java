package br.com.maratonajava.javacore.rdate.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYars = LocalDate.now().plusYears(2).plusDays(7);

        Period p1 = Period.between(now, nowAfterTwoYars);
        Period p2 = Period.ofWeeks(58);
        Period p3 = Period.ofMonths(3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
