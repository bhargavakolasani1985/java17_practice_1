package com.kbc.java17.practice.format;

import java.text.NumberFormat;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestFormatClass12 {
    public static void main(String... unused) {
        LocalDateTime dt = LocalDateTime.of(2023, 12, 11, 17, 03);
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

}
