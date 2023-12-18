package com.kbc.java17.practice.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestFormatClass20 {
    public static void main(String... unused) {
        LocalDateTime dt = LocalDateTime.of(2023, 11, 12, 17, 03);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh, mm, ss");
        System.out.println(dt.format(f1));
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("h, m, s");
        System.out.println(dt.format(f2));
    }

}
