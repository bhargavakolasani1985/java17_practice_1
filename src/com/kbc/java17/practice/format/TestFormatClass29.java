package com.kbc.java17.practice.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestFormatClass29 {
    public static void main(String... unused) {
        LocalDateTime dt = LocalDateTime.of(2023, 11, 12, 7, 03);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd, MM, yyyy, 'at' hh a");
        System.out.println(dt.format(f1));
    }

}
