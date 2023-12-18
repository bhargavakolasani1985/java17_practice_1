package com.kbc.java17.practice.format;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestFormatClass33 {
    public static void main(String... unused) {
        LocalDateTime dt = LocalDateTime.of(2023, 11, 12, 17, 03);
        ZonedDateTime zdt1 = ZonedDateTime.of(dt, ZoneId.of("GMT"));
        System.out.println(zdt1);
        ZonedDateTime zdt2 = ZonedDateTime.of(dt, ZoneId.of("UTC"));
        System.out.println(zdt2);
    }

}
