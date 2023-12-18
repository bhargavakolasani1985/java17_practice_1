package com.kbc.java17.practice.format;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TestFormatClass36 {
    public static void main(String... unused) {
        var spain = new Locale("es", "ES");
        var money = 10.25;
        Locale.setDefault(Locale.US);
        printValue(spain, money);

        Locale.setDefault(Locale.Category.DISPLAY, spain);
        printValue(spain, money);

        Locale.setDefault(Locale.Category.FORMAT, spain);
        printValue(spain, money);
    }

    private static void printValue(Locale locale, double money) {
        var f = NumberFormat.getCurrencyInstance();
        System.out.println(f.format(money)+"---"+locale.getDisplayLanguage());
    }

}
