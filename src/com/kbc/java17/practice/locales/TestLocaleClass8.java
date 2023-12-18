package com.kbc.java17.practice.locales;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class TestLocaleClass8 {
    public static void main(String... unused) throws ParseException {
        String price = "40.45";
        Locale.setDefault(new Locale("en", "US"));
        NumberFormat nf1 = NumberFormat.getInstance();
        System.out.println(nf1.parse(price));
        NumberFormat nf2 = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(nf2.parse(price));
    }
}
