package com.kbc.java17.practice.format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestFormatClass14 {
    public static void main(String... unused) {
        LocalDate dt = LocalDate.of(2023, 12, 11);
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }

}
