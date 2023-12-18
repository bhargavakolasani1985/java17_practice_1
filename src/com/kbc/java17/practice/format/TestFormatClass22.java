package com.kbc.java17.practice.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestFormatClass22 {
    public static void main(String... unused) {
        LocalDateTime dt = LocalDateTime.of(2023, 11, 12, 17, 03);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh, mmm, ss");
        System.out.println(dt.format(f1));
    }

}
