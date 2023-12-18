package com.kbc.java17.practice.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestFormatClass17 {
    public static void main(String... unused) {
        LocalDateTime dt = LocalDateTime.of(2023, 11, 12, 17, 03);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd, MM, yyyy");
        System.out.println(dt.format(f1));
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd, MMM, yy");
        System.out.println(dt.format(f2));
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd, MMMM, yy");
        System.out.println(dt.format(f3));
        DateTimeFormatter f4= DateTimeFormatter.ofPattern("dd, MMMMM, yy");
        System.out.println(dt.format(f4));
        DateTimeFormatter f5= DateTimeFormatter.ofPattern("dd, MMMM, yyyyy");
        System.out.println(dt.format(f5));
        DateTimeFormatter f6= DateTimeFormatter.ofPattern("d, M, y");
        System.out.println(dt.format(f6));
    }

}
