package com.kbc.java17.practice.format;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestFormatClass34 {
    public static void main(String... unused) {
        Locale.setDefault(Locale.US);
        LocalDateTime dt = LocalDateTime.of(2023, 11, 12, 17, 03);
        ZonedDateTime zdt1 = ZonedDateTime.of(dt, ZoneId.of("GMT"));
        System.out.println(zdt1);
        ZonedDateTime zdt2 = ZonedDateTime.of(dt, ZoneId.of("UTC"));
        System.out.println(zdt2);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd, MM, yyyy, 'at' hh':'mm z");
        System.out.println(zdt1.format(f1));
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd, MM, yyyy, 'at' hh':'mm Z");
        System.out.println(zdt2.format(f2));
    }

}
