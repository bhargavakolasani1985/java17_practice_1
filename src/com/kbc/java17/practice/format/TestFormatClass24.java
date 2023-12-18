package com.kbc.java17.practice.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestFormatClass24 {
    public static void main(String... unused) {
        LocalDateTime dt = LocalDateTime.of(2023, 11, 12, 7, 03);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd, MM, yyyy, hh");
        System.out.println(dt.format(f1));
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd, MMM, yy, hh, mm,");
        System.out.println(dt.format(f2));
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("hh, MMMM, yy");
        System.out.println(dt.format(f3));
        DateTimeFormatter f4= DateTimeFormatter.ofPattern("hh, mm, yy");
        System.out.println(dt.format(f4));
    }

}
