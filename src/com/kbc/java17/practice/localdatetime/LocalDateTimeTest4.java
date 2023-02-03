package com.kbc.java17.practice.localdatetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest4 {
    public static void main(String[] args) {
        var date = LocalDate.now();

        System.out.println(date.format(DateTimeFormatter.ofPattern("ddMMMyy")));
    }
}