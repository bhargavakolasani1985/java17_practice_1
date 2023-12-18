package com.kbc.java17.practice.locales;

import java.text.NumberFormat;
import java.util.Locale;

public class TestLocaleClass6 {
    public static void main(String... unused) {
        Locale.setDefault(Locale.UK);
        double totalPrice = 3_200_000.25;
        NumberFormat nf1 = NumberFormat.getInstance();
        System.out.println(nf1.format(totalPrice));
        NumberFormat nf2 = NumberFormat.getNumberInstance();
        System.out.println(nf2.format(totalPrice));
        NumberFormat nf3 = NumberFormat.getCompactNumberInstance();
        System.out.println(nf3.format(totalPrice));
        NumberFormat nf4 = NumberFormat.getIntegerInstance();
        System.out.println(nf4.format(totalPrice));
        NumberFormat nf5 = NumberFormat.getCurrencyInstance();
        System.out.println(nf5.format(totalPrice));
        NumberFormat nf6 = NumberFormat.getPercentInstance();
        System.out.println(nf6.format(totalPrice));
    }
}
