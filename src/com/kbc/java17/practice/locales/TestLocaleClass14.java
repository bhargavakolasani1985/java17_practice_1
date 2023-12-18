package com.kbc.java17.practice.locales;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.stream.Stream;

public class TestLocaleClass14 {
    public static void main(String... unused) throws ParseException {
        Locale.setDefault(Locale.US);
        var streamOfFormatters = Stream.of(
                NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.LONG),
                NumberFormat.getNumberInstance());
        streamOfFormatters.map(s ->
                s.format(7_623_456)).forEach(System.out::println);
    }
}
