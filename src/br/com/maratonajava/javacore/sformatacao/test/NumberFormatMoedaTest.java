package br.com.maratonajava.javacore.sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatMoedaTest {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeBR);

        double valor = 100_000_000.2130;

        for (NumberFormat numberF : nfa) {
            numberF.setMaximumFractionDigits(2);
            System.out.println(numberF.format(valor));

        }
        String valorString = "$100.2130";
        try {
            System.out.println(  nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
