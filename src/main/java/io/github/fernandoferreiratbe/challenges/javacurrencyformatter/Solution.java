package io.github.fernandoferreiratbe.challenges.javacurrencyformatter;

import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        double value = 12324.134;

        Locale locale = Locale.getDefault();

        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country : " + locale.getCountry());

        NumberFormat usCurrency     = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        NumberFormat indiaCurrency  = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaCurrency  = NumberFormat.getCurrencyInstance(new Locale(Locale.CHINA.getLanguage(), Locale.CHINA.getCountry()));
        NumberFormat franceCurrency = NumberFormat.getCurrencyInstance(new Locale(Locale.FRANCE.getLanguage(), Locale.FRANCE.getCountry()));

        System.out.println("US: " + usCurrency.format(value));
        System.out.println("India: " + indiaCurrency.format(value));
        System.out.println("China: " + chinaCurrency.format(value));
        System.out.println("France: " + franceCurrency.format(value));
    }
}
