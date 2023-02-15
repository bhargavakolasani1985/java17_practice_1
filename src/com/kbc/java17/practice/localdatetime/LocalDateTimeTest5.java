package com.kbc.java17.practice.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest5 {
    public static void main(String[] args) {
        var f = DateTimeFormatter.ofPattern("hh o'clock");
        System.out.println(f.format(LocalDateTime.now()));
    }
}