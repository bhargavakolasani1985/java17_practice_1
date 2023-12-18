package com.kbc.java17.practice.locales;

import java.text.NumberFormat;
import java.util.Locale;

public class TestLocaleClass7 {
    public static void main(String... unused) {
        double publishRate = 0.802;
        var us = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(us.format(publishRate));
        var gr = NumberFormat.getPercentInstance(Locale.GERMANY);
        System.out.println(gr.format(publishRate));
    }

}
