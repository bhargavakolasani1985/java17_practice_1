package com.kbc.java17.practice.format;

import java.text.NumberFormat;
import java.time.Clock;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestFormatClass6 {

    private void printCurrentTime(LocalTime time) {
        var f = DateTimeFormatter.ofPattern("'It''s 'h' hours past midnight, and 'mm' minutes'");
        System.out.println(f.format(time));
        System.out.print("' \'");
    }
    public static void main(String[] unused) {
        new TestFormatClass6().printCurrentTime(LocalTime.of(4, 5));
    }

}
