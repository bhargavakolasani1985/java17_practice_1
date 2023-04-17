package com.kbc.java17.practice.localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest9 {
    public static void main(String[] args) {
        var date = LocalDate.of(2100, 5, 14);
        var time = LocalTime.of(9, 15);
        var dateTime = LocalDateTime.of(date, time);
        var d = Duration.of(1, ChronoUnit.WEEKS);
        System.out.println(dateTime.plus(d));
    }
}