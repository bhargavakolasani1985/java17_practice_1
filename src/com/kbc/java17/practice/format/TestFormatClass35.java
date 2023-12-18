package com.kbc.java17.practice.format;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TestFormatClass35 {
    public static void main(String... unused) {
        Locale.setDefault(Locale.US);
        var l = new Locale("it");
        LocalDateTime ldt = LocalDateTime.of(2023, 12, 17, 17, 04);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        printDateTime(ldt, l, dtf1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        printDateTime(ldt, l, dtf2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        printDateTime(ldt, l, dtf3);
    }

    private static void printDateTime(LocalDateTime ldt, Locale l, DateTimeFormatter dtf) {
        System.out.println(dtf.format(ldt)+"---"+dtf.withLocale(l).format(ldt));
    }

}
