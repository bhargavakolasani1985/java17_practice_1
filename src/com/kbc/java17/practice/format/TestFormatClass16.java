package com.kbc.java17.practice.format;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestFormatClass16 {
    public static void main(String... unused) {
        LocalTime dt = LocalTime.of( 17, 03, 55);
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

}
