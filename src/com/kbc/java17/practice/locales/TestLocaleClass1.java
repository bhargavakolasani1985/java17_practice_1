package com.kbc.java17.practice.locales;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestLocaleClass1 {
    public static void main(String... unused) {
        Locale l = Locale.getDefault();
        System.out.println(l);
    }

}
