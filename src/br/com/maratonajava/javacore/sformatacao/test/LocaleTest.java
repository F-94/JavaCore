package br.com.maratonajava.javacore.sformatacao.test;

import br.com.maratonajava.javacore.gassociacao.exercicio.dominio.Local;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeIHolanda = new Locale("nl", "NL");
        Locale localeCH = new Locale("it", "CH");
        Calendar calendar = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIHolanda);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        System.out.println("Italy " + df.format(calendar.getTime()));
        System.out.println("Suiça " + df1.format(calendar.getTime()));
        System.out.println("India " + df2.format(calendar.getTime()));
        System.out.println("Japao " + df4.format(calendar.getTime()));
        System.out.println("Holanda " + df3.format(calendar.getTime()));

        System.out.println(localeCH.getDisplayCountry());
    }
}
