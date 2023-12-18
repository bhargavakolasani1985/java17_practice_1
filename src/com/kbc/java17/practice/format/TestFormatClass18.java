package com.kbc.java17.practice.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestFormatClass18 {
    public static void main(String... unused) {
        LocalDateTime dt = LocalDateTime.of(2023, 11, 11, 17, 03);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd, MMMMMM, yyyy");
        System.out.println(dt.format(f1));
    }

}
