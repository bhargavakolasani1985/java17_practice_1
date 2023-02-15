package com.kbc.java17.practice.format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TestFormatClass5 {

    public static void print(double t) {
        Locale.setDefault(new Locale("en", "US"));
        System.out.println(NumberFormat.getCompactNumberInstance().format(t));

        System.out.println(
                NumberFormat.getCompactNumberInstance(
                        Locale.getDefault(), NumberFormat.Style.SHORT).format(t));

        System.out.println(NumberFormat.getCurrencyInstance().format(t));

        System.out.println(
                NumberFormat.getCompactNumberInstance(
                            new Locale("en", "US"), NumberFormat.Style.SHORT)
                        .format(t));
    }
    public static void main(String... unused) {
        print(100_102.2);
    }

}
