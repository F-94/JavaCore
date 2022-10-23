package br.com.maratonajava.javacore.sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat []df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.LONG);
        df[4] = DateFormat.getDateInstance(DateFormat.FULL);
        df[5] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[6] = DateFormat.getDateInstance(DateFormat.MEDIUM);

        for (DateFormat dateformat : df){
        System.out.println(dateformat.format(c.getTime()));

        }
    }
}
